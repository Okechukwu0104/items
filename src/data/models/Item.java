package data.models;

import java.util.Random;

import static data.repositories.Items.items;

public class Item {


    private String ID ;
    private String name ;
    private String description;
    private TrackingInfo trackingInfo;


    public void create (String name, String description, String weightInGrams) {
        TrackingInfo trackingInfo = new TrackingInfo();
        this.name = setName(name);
        this.description = setDescription(description);
        this.trackingInfo = trackingInfo.create(name,description,weightInGrams);

        this.ID = generateID();
        items.add(this);
    }


    public Item find(String ID){
        for(Item item : items){
            if(item.getID().equals(ID)){
                return item;
            }
        }throw new IllegalArgumentException("No Item with ID " + ID+ " found");
    }


    public String getID() {
        return ID;
    }

    public void update(String ID, String name, String description, String weightInGrams) {
        Item foundItem = find(ID);
        foundItem.resetID(foundItem,ID);
        foundItem.setName(name);
        foundItem.setDescription(description);
        foundItem.editQuantity(weightInGrams);

    }

    public void delete(String ID) {
        Item foundItem = find(ID);
        items.remove(foundItem);
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }















    private void resetID(Item foundItem, String id) {
        foundItem.ID = id;
    }


    private void editQuantity(String weightInGrams) {
        this.trackingInfo.setWeightInGrams(weightInGrams);
        System.out.println(trackingInfo);
    }


    private String generateID() {
        if(this.ID != null){
            throw new IllegalArgumentException("You already have an ID");
        }
        Random random = new Random();
        this.ID  = "ITEM-"+ random.nextInt(100000);
        return this.ID;

    }


    private String setName(String name) {
        this.name = name;
        return name;
    }

    private String setDescription(String description) {
        this.description = description;
        return description;
    }

}
















