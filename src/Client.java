public class Client {
    public static void main(String[] args) {
        IranianGardenCreator IGC = new IranianGardenCreator();
        JapaneseGardenCreator JGC = new JapaneseGardenCreator();

        IGC.createFlower(4, Color.RED);
        IGC.createTree(10, 32);
        JGC.createFlower(7, Color.WHITE);
        JGC.createTree(3, 14);

        Chenar chenar = IGC.getReault();
        Khatmi khatmi = IGC.getResult();
        System.out.println("Iranian Garden:\n" + chenar.getNumberOfTrees() + " Chenars with " + chenar.getTreeHight() + "m hight & " + khatmi.getNumberOfFlowers() + " Khatmis with " + khatmi.getColor() + " color.\n");

        J1 j1 = JGC.getReault();
        G1 g1 = JGC.getResult();
        System.out.println("Japanese Garden:\n" + j1.getNumberOfTrees() + " J1s with " + j1.getTreeHight() + "m hight & " + g1.getNumberOfFlowers() + " G1s with " + g1.getColor() + " color.\n");
    }
}
