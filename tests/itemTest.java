import data.models.Item;
import data.models.TrackingInfo;
import org.junit.jupiter.api.Test;

public class itemTest {
    @Test
    public void TestThatIdsAreGeneratedProperly(){
        Item item = new Item("name",  "description",  "trackingInfo");
        String generatedID = item.generateID();
        System.out.print(generatedID);
    }


}
