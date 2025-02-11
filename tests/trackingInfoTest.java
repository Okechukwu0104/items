import data.models.TrackingInfo;
import org.junit.jupiter.api.Test;

public class trackingInfoTest {
    @Test
    public void testThatYouGenerateId() {
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.addTrackingInfo( "name", "Description", "WeightInGrams");
        String generatedID = trackingInfo.getID();
        System.out.print(generatedID);
    }
}
