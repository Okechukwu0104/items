package data.models;

import data.repositories.Items;

import java.util.Objects;
import java.util.Random;

import static data.repositories.Items.items;

public class Item {


    private String ID ;
    private String name ;
    private String description;
    private TrackingInfo trackingInfo;


    public Item(String name, String description, String weightInGrams) {
        TrackingInfo trackingInfo = new TrackingInfo();
        this.name = setName(name);
        this.description = description;
        this.trackingInfo = trackingInfo.addTrackingInfo( name,  description,  weightInGrams);
        this.ID = generateID();
        items.add(this);
    }



    public Item findItem(String ID){
        for(Item item : items){
            if(item.getID().equals(ID)){
                return item;
            }
        }throw new IllegalArgumentException("No Item with ID " + ID+ " found");
    }


    public String getID() {
        return ID;
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

    private String setTrackingInfo(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
        return trackingInfo.toString();
    }






}
















