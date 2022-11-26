package ch.wiss;
import java.util.Random;

public class FairCoin implements Coin{
    Random rng = new Random();

    @Override
    public int toss() {
        return rng.nextInt(0,2);
    }
}
