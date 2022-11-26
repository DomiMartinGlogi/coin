package ch.wiss;
import java.util.Random;

public class UnfairCoin implements Coin{
    Random rng = new Random();
    public int toss(double probtail) {
        double tail = probtail * 100;
        System.out.println(tail);
        int luck =  rng.nextInt(0,(int) tail);
        System.out.println(luck);
        if (luck % 9 == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    /*
    toss(double probtail) can be checked by saving all results into a file and then counting the resulting 1s and 0s
    with another program or script.
     */

    @Override
    public int toss() {
        return 0;
    }
}
