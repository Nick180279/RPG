import java.util.Random;

public class Dice {
    private int side;

    public Dice (int side) {
        this.side = side;
    }

    public Dice () {
        this.side = 20;
    }

    public int getSide() {
        return side;
    }

    public int Roll() {
        Random roll = new Random();
        return roll.nextInt(this.side) + 1;
    }
}
