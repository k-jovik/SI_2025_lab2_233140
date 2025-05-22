package mk.ukim.finki;

import java.util.ArrayList;
import java.util.List;


public class SILab2 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        Item obj = new Item("lip gloss",1,10,5);
        items.add(obj);
        double result = checkCart(items, "A145653784915478");
    }
    public static double checkCart(List<Item> allItems, String cardNumber){
        if (allItems == null){ //A
            throw new RuntimeException("allItems list can't be null!"); //B
        }

        double sum = 0; //C

        for (int i = 0; i < allItems.size(); i++){ //D1 D2 D3
            Item item = allItems.get(i); //E
            if (item.getName() == null || item.getName().length() == 0){ //F
                throw new RuntimeException("Invalid item!"); //G
            }

            if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10){//H
                sum -= 30; //I
            }

            if (item.getDiscount() > 0){ //J
                sum += item.getPrice()*(1-item.getDiscount())*item.getQuantity(); //K
            }
            else { //L
                sum += item.getPrice()*item.getQuantity(); //M
            }

        }
        if (cardNumber != null && cardNumber.length() == 16) { //N
            String allowed = "0123456789";// O
            char[] chars = cardNumber.toCharArray(); //P
            for (int j = 0; j < cardNumber.length(); j++) { // Q1 Q2 Q3
                char c = cardNumber.charAt(j); //R
                if (allowed.indexOf(c) == -1) { //S
                    throw new RuntimeException("Invalid character in card number!"); //T
                }
            }
        }
        else{ //U
            throw new RuntimeException("Invalid card number!"); //V
        }

        return sum; //X

    }
}