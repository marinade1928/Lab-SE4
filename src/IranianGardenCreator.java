public class IranianGardenCreator implements AbstractGardenCreator {

    private Color color;
    private int numberOfFlowers;
    private int treeHight;
    private int numberOfTrees;

    @Override
    public void createTree(int treeHight, int numberOfTrees) {
        this.treeHight = treeHight;
        this.numberOfTrees = numberOfTrees;
    }

    @Override
    public void createFlower(int numberOfFlowers, Color color) {
        this.color = color;
        this.numberOfFlowers = numberOfFlowers;
    }

    public Chenar getReault(){
        return new Chenar(treeHight, numberOfTrees);
    }

    public Khatmi getResult(){
        return new Khatmi(color, numberOfFlowers);
    }

    public Color getColor() {
        return color;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    public int getTreeHight() {
        return treeHight;
    }
}
