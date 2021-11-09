import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JapaneseGardenTest {
    private JapaneseGardenCreator getJapaneseGarden(Color color, int numberOfFlowers, int numberOfTrees, int treeHight){
        JapaneseGardenCreator IG = new JapaneseGardenCreator();
        IG.createTree(treeHight, numberOfTrees);
        IG.createFlower(numberOfFlowers, color);
        return IG;
    }

    @Test
    public void colorTest(){
        JapaneseGardenCreator IGT = getJapaneseGarden(Color.WHITE, 3, 27,23);
        assertEquals("Color Test: ", Color.WHITE, IGT.getColor());
    }

    @Test
    public void numberOfFlowersTest(){
        JapaneseGardenCreator IGT = getJapaneseGarden(Color.RED, 5, 7,2);
        assertEquals("Number Of Flowers Test: ", 5, IGT.getNumberOfFlowers());
    }

    @Test
    public void numberOfTreesTest(){
        JapaneseGardenCreator IGT = getJapaneseGarden(Color.WHITE, 6, 9,3);
        assertEquals("Number Of Trees Test: ", 9, IGT.getNumberOfTrees());
    }

    @Test
    public void treeHightTest(){
        JapaneseGardenCreator IGT = getJapaneseGarden(Color.BLUE, 10, 24,5);
        assertEquals("Number Of Trees Test: ", 5, IGT.getTreeHight());
    }
}