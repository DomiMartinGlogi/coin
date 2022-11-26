/*
FairCoin should return the same result 3 times in a row in 25% of cases, if called only 3 times.
Half of those should be each Heads or Tails.
 */
package ch.wiss;

public class FairCoinTest {

    public void main(){
        int counter0 = 0, counter1 = 0, totalRuns = 10000;
        for (int i = 0; i < totalRuns; i++) {
            int[] toCheck = this.threeToss();
            if (toCheck[0]==toCheck[1] && toCheck[0]==toCheck[2]){
                System.out.println(toCheck[0] + " occured 3 times in a row!");
                if (toCheck[0]==1){
                    counter1++;
                }
                else {
                    counter0++;
                }
            }
            else{
                System.out.println("Did not occur 3 times in a row.");
            }
        }
        System.out.println("0 occured thrice in a row " + counter0 + " times.");
        System.out.println("1 occured thrice in a row " + counter1 + " times.");
        System.out.println("A total of " + totalRuns + " series of 3 were thrown.");
    }

    public int[] threeToss(){
        Coin coin = new FairCoin();
        int[] results = new int[3];
        for (int i = 0; i < 3; i++) {
            results[i] = coin.toss();
        }
        return results;
    }
}
