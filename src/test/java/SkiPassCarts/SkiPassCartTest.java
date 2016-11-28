package SkiPassCarts;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class SkiPassCartTest {
    Date date = new Date(12,7,2017);
    CartForDays cart = new CartForDays(1,CartType.WEEKEND,date, 5);
    @Test
    public void TestSkiPassDate(){
        assertEquals(date, cart.getValidity());
    }

    @Test
    public void TestSkiPassType(){
        assertEquals(CartType.WEEKEND, cart.getCartType());
    }

    @Test
    public void TestSkiPassChangeValidity(){
        Date date1 = new Date(12,10,2017);
        cart.changeValidity(date1);
        assertEquals(date1, cart.getValidity());
    }
}