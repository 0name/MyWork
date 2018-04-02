package War;

import java.util.Random;

public class Fight {

    public static void fight(Soldier[] whiteArmy, Soldier[] redArmy){
        Random rnd = new Random();

        for (int i = 0; i < 10; i++){
            if (rnd.nextBoolean()) {
                whiteArmy[i].attack(redArmy[i]);
            } else {
                redArmy[i].attack(whiteArmy[i]);
            }
        }
    }

    public static void winner(Soldier[] whiteArmy, Soldier[] redArmy){
        int whiteLive = 0, redLive = 0;
        for (int i = 0; i < 10; i++){
            if(redArmy[i].isLive() ){
                redLive++;
            }
            if(whiteArmy[i].isLive() ){
                whiteLive++;
            }
        }
        System.out.println("White " + whiteLive + " Red " + redLive);
    }

    public static void main(String[] args) {

        Soldier[] whites =  new Soldier[10];
        Soldier[] reds =  new Soldier[10];

        for (int i = 0; i < whites.length; i++){
            whites[i] = new White();
            reds[i] = new Red();
        }

        fight(whites, reds);
        winner(whites, reds);
    }
}
