import data.models.Item;
import org.junit.jupiter.api.Test;

public class itemTest {
    @Test
    public void TestThatIdsAreGeneratedProperly(){
        Item item = new Item("name",  "description", "1000 bags");
        String generatedID = item.getID();
        System.out.print(generatedID);
    }


}
