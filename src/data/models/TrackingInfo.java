package data.models;

import java.util.Date;
import java.util.Random;

import static data.repositories.TrackingInfos.trackingInfos;

public class TrackingInfo {
    private String ID;
    private String name;
    private String description;
    private static String weightInGrams;
    private String date;


    public TrackingInfo create ( String name, String description, String weightInGrams ) {
        this.name = setName(name);
        this.description = setDescription(description);
        TrackingInfo.weightInGrams = setWeightInGrams(weightInGrams);
        this.date = new Date().toString();
        this.ID = generateID();
        trackingInfos.add(this);
        return this;

    }


    private String generateID() {
        if(this.ID != null){
            throw new IllegalArgumentException("You already have an ID");
        }
        Random random = new Random();
        this.ID  = "TrackID-"+ random.nextInt(100000);
        return this.ID;

    }

    public String getID() {
        return ID;
    }


    public static TrackingInfo find(String ID){
        for(TrackingInfo trackingInfo : trackingInfos){
            if(trackingInfo.getID().equals(ID)){
                return trackingInfo;
            }
        }throw new IllegalArgumentException("No Item with ID " + ID+ " found");
    }

    public static String getWeightInGrams() {
        return weightInGrams;
    }
    public void delete(String ID){
        TrackingInfo found = find(ID);
        trackingInfos.remove(found);
    }


















    private String setDescription(String description) {
        this.description = description;
        return description;
    }

    private String setName(String name) {
        this.name = name;
        return name;
    }
    String setWeightInGrams(String weightInGrams) {
        this.weightInGrams = weightInGrams;
        return weightInGrams;
    }


}

