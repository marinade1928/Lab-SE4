import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IranianGardenTest {
    private IranianGardenCreator getIranianGarden(Color color, int numberOfFlowers, int numberOfTrees, int treeHight){
        IranianGardenCreator IG = new IranianGardenCreator();
        IG.createTree(treeHight, numberOfTrees);
        IG.createFlower(numberOfFlowers, color);
        return IG;
    }

    @Test
    public void colorTest(){
        IranianGardenCreator IGT = getIranianGarden(Color.WHITE, 3, 27,23);
        assertEquals("Color Test: ", Color.WHITE, IGT.getColor());
    }

    @Test
    public void numberOfFlowersTest(){
        IranianGardenCreator IGT = getIranianGarden(Color.RED, 5, 7,2);
        assertEquals("Number Of Flowers Test: ", 5, IGT.getNumberOfFlowers());
    }

    @Test
    public void numberOfTreesTest(){
        IranianGardenCreator IGT = getIranianGarden(Color.WHITE, 6, 9,3);
        assertEquals("Number Of Trees Test: ", 9, IGT.getNumberOfTrees());
    }

    @Test
    public void treeHightTest(){
        IranianGardenCreator IGT = getIranianGarden(Color.BLUE, 10, 24,5);
        assertEquals("Number Of Trees Test: ", 5, IGT.getTreeHight());
    }
}