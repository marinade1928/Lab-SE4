public class J1 implements AbstractTree{

    private int treeHight;
    private int numberOfTrees;

    public J1(int treeHight, int numberOfTrees){
        this.numberOfTrees = numberOfTrees;
        this.treeHight = treeHight;
    }

    @Override
    public void setTreeHight(int treeHight) {
        this.treeHight = treeHight;
    }

    @Override
    public void setNumberOfTrees(int numberOfTrees) {
        this.numberOfTrees = numberOfTrees;
    }

    public int getNumberOfTrees() {
        return numberOfTrees;
    }

    public int getTreeHight() {
        return treeHight;
    }
}
