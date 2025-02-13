import data.models.Item;
import data.models.TrackingInfo;
import org.junit.jupiter.api.Test;

import static data.repositories.Items.items;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class itemTest {
    @Test
    public void TestThatIdsAreGeneratedProperly(){
        Item item = new Item();
        item.create("name",  "description", "1000 bags");
        Item item2 = new Item();
        item2.create("name",  "description", "1000 bags");
        String generatedID = item.getID();
        System.out.print(generatedID);
        assertEquals(2, items.size());

    }

    @Test
    public void TestThatYouCanSaveAndFindItem(){
        Item item1 = new Item();
        item1.create("name",  "description", "1000 bags");
        String generatedID1 = item1.getID();
        System.out.println(item1.find(generatedID1).getName());
        assertEquals(1, items.size());

    }

    @Test
    public void TestThatYouCanUpdateItem(){
        Item item1 = new Item();

        item1.create("name",  "description", "1000 bags");
        String generatedID1 = item1.getID();
        item1.update(generatedID1,"new name",  "new description", "5 bags");

        assertEquals("new name", item1.find(generatedID1).getName());
        assertEquals("new description", item1.find(generatedID1).getDescription());
        String trackingInfo1 = TrackingInfo.getWeightInGrams();
        assertEquals("5 bags", trackingInfo1);

    }

    @Test
    public void TestThatYouCanDeleteItem(){
        Item item1 = new Item();
        item1.create("name",  "description", "1000 bags");
        String generatedID1 = item1.getID();
        assertEquals(1, items.size());
        item1.delete(generatedID1);
        assertEquals(0, items.size());

    }


}
