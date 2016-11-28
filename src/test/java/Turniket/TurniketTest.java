package Turniket;

import SkiPassCarts.CartForDays;
import SkiPassCarts.CartType;
import SkiPassCarts.CartWithNumberOfHeave;
import SkiPassCarts.Date;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class TurniketTest {
    Date date = new Date(12,7,2017);
    CartWithNumberOfHeave cart = new CartWithNumberOfHeave(1, CartType.WORKING ,date, 2);
    Date today = new Date(10,2,2016);
    Turniket tur = new Turniket(cart,today);

    @Test
    public void TestTurniketRight(){
        assertEquals(true, tur.checkCart());
    }

    @Test
    public void TestTurniketLessHeaves(){
        tur.checkCart();
        tur.checkCart();
        assertEquals(false, tur.checkCart());
    }

    @Test
    public void TestTurniketWrongDate(){
        Date today1 = new Date(10,2,2018);
        Turniket tur = new Turniket(cart,today1);
        assertEquals(false, tur.checkCart());
    }

}