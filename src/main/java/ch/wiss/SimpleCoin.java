package ch.wiss;

public class SimpleCoin implements Coin {
    boolean[] coin = {true, false, false, true};

    @Override
    public int toss() {
        int result;
        if (coin[3]){
            result = 1;
        }
        else{
            result = 0;
        }
        LSFR();
        return result;
    }
    private void LSFR(){
        boolean next;
        next = coin[2] ^ coin[3];
        for (int i = coin.length - 1; i > 0; i--) {
            coin[i] = coin[i-1];
        }
        coin[0] = next;
    }

    @Override
    public String toString(){
        String output = "";
        for (int i = 0; i < coin.length; i++) {
            if (coin[i]){
                output += "1";
            }
            else {
                output += "0";
            }
        }
        return output;
    }
}
