package data.models;

import java.util.Date;
import java.util.Random;

import static data.repositories.TrackingInfos.trackingInfos;

public class TrackingInfo {
    private String ID;
    private String name;
    private String description;
    private String weightInGrams;
    private String date;


    public TrackingInfo addTrackingInfo( String name, String description, String weightInGrams ) {
        this.name = setName(name);
        this.description = setDescription(description);
        this.weightInGrams = setWeightInGrams(weightInGrams);
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

    public void findTrackingInfo(String ID){

    }



















    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String setWeightInGrams(String weightInGrams) {
        this.weightInGrams = weightInGrams;
        return weightInGrams;
    }
}

