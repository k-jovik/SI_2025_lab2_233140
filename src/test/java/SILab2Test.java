import mk.ukim.finki.Item;
import mk.ukim.finki.SILab2;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    //C0: Every statement -----------------------------------------------------------------------
    @Test
    public void everyStatementTest(){

        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "21456"));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null, 1, 10, 5)), "2145653784915478"));
        assertTrue(ex.getMessage().contains("Invalid item!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("lip gloss", 1, 10, 5)), "21456"));
        assertTrue(ex.getMessage().contains("Invalid card number!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("lip gloss", 1, 10, 0)), "21456"));
        assertTrue(ex.getMessage().contains("Invalid card number!"));

        assertDoesNotThrow(()-> SILab2.checkCart(List.of(new Item("lip gloss", 1, 10, 5)), "2145653784915478"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("lip gloss", 100, 10, 0)), "A145653784915478"));
        assertTrue(ex.getMessage().contains("Invalid character in card number!"));


    }



    @Test
    public void MultipleConditionTest(){
        List<Item> items = List.of(
                new Item("Item1", 9, 0, 0),    //F || F || F
                new Item("Item2", 11, 0, 0),   //F || F || T
                new Item("Item3", 9, 0, 2),    //F || T || F
                new Item("Item4", 9, 400, 0),  //T || F || F
                new Item("Item5", 20, 400, 2), //T || T || T
                new Item("Item6", 8, 400, 2),  //T || T || F
                new Item("Item7", 100, 400, 0),//T || F || T
                new Item("Item8", 100, 200, 2) //F || T || T
        );
        assertDoesNotThrow(() -> SILab2.checkCart(items, "2534123490135467"));
    }
}
