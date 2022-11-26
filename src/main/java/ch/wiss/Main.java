/*
Main is only used to test things, please ignore.
 */
package ch.wiss;

public class Main {
    public static void main(String[] args) {
        /*
        Coin coin = new SimpleCoin();
        for (int i = 0; i < 16; i++) {
            System.out.println(coin + "->" + coin.toss());
        }
         */

       FairCoinTest fairCoinTest = new FairCoinTest();
       fairCoinTest.main();

        /*
        UnfairCoin coin3 = new UnfairCoin();
        for (int i = 0; i < 10000; i++) {
            int result = coin3.toss(0.9);
            System.out.println("Result : " + result);
        }
         */

    }

}