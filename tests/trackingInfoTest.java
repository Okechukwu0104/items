
import data.models.TrackingInfo;
import org.junit.jupiter.api.Test;

import static data.repositories.TrackingInfos.trackingInfos;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class trackingInfoTest {
    @Test
    public void testThatYouGenerateId() {
        TrackingInfo trackingInfo1 = new TrackingInfo();
        trackingInfo1.create("name", "description", "1000 bags");
        TrackingInfo trackingInfo2 = new TrackingInfo();
        trackingInfo2.create("name", "description", "1000 bags");

        String generatedID = trackingInfo1.getID();
        System.out.print(generatedID);

    }


    @Test
    public void TestThatYouCanSaveAndFindTrackingInfo(){
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.create("name", "Description", "WeightInGrams");
        String generatedID1 = trackingInfo.getID();
        System.out.println(TrackingInfo.find(generatedID1));
        assertEquals(1, trackingInfos.size());

    }

    @Test
    public void TestThatYouCanDeleteItem(){
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.create("name", "Description", "WeightInGrams");
        String generatedID1 = trackingInfo.getID();
        assertEquals(1, trackingInfos.size());
        trackingInfo.delete(generatedID1);
        assertEquals(0, trackingInfos.size());


    }

}
