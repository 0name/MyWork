/*
package Practice.Duplicate.goodsList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
    public static final String ADD = "add data";
    public static final String SHOW = "Show data";
    public static final String CLOSE = "close";

    private Map<String, Map> card = new HashMap<>();

    public Map<String, Map> getCard(){
        return card;
    }

    public void addCard(String str){
        Map<String, Integer> good = new HashMap<>();
        String[]arr = str.split(" ");
        String name = arr[0];
        String tov = arr[1];
        int num = Integer.getInteger(arr[2]);
        if(this.card.containsKey(arr[0])) {
            good = card.get(arr[0]);
            if(card.get(arr[0]).containsKey(arr[1])){
                good.put(tov, good.get(tov + num));
            }else {
                good.put(tov, num);
            }
        }else {
            good.put(tov, num);
        }

        this.card.put(arr[0], good);
    }

    public void showCard(){
    for(Map.Entry entry: card.entrySet()){
        System.out.println(entry.getKey() + ":");
        for (Map.Entry en: card.get(entry.getKey()).entrySet()){
            System.out.println(en.getKey() + " " + en.getValue());
        }
    }
    }

    String name;
    String good;
    int count;

    public Shop(String name, String good, int count){
        this.name = name;
        this.good = good;
        this.count = count;
    }

    public void add(String comand){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        goods list
        System.out.println("Enter a command");
        String str = scan.nextLine();
        while(true){
            System.out.println("Enter a comand");
            String num = scan.nextLine();
            if(num.equals(ADD)){

            }
            if(num.equals(SHOW)){

            }
            if(num.equals(CLOSE)){
                System.exit(0);
            }
        }
    }
}
*/
