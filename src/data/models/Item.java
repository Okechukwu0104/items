package data.models;

import java.util.Objects;
import java.util.Random;

public class Item {


    private int ID ;
    private String name ;
    private String description;
    private TrackingInfo trackingInfo;
//    private Reciever receiver;
//    private Sender sender;

    public Item(String name, String description, TrackingInfo trackingInfo) {
        this.name = setName(name);
        this.description = description;
        this.trackingInfo = trackingInfo;

    }


    private void saveItem(int ID, String name, String description, String weightInGrams) {
        setDescription(description);
        TrackingInfo trackingInfo = new TrackingInfo(String.valueOf(ID),  name,  description, weightInGrams);

    }


    public void findItem(String ID){}



    public String generateID() {
        if(this.ID == 0){
            Random random = new Random();
            this.ID  = random.nextInt(100000);

        }return String.valueOf(ID);

    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public String setTrackingInfo(TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
        return trackingInfo.toString();
    }






}
















