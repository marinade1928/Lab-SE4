public class G1 implements AbstractFlower{
    private Color color;
    private int numberOfFlowers;

    public G1(Color color, int numberOfFlowers){
        this.color = color;
        this.numberOfFlowers = numberOfFlowers;
    }

    @Override
    public void setNumberOfFlowers(int numberOfFlowers) {
        this.numberOfFlowers = numberOfFlowers;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getNumberOfFlowers() {
        return numberOfFlowers;
    }
}
