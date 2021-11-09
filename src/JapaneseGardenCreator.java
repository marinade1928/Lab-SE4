public class JapaneseGardenCreator implements AbstractGardenCreator{

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

    public J1 getReault(){
        return new J1(treeHight, numberOfTrees);
    }

    public G1 getResult(){
        return new G1(color, numberOfFlowers);
    }
}
