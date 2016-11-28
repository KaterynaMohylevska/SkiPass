package Turniket;

import SkiPassCarts.CartWithNumberOfHeave;
import SkiPassCarts.Date;
import SkiPassCarts.SkiPassCart;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class Turniket implements CheckCart{
    SkiPassCart cart;
    Date today;
    public Turniket(SkiPassCart cart, Date today){
        this.cart = cart;
        this.today = today;
    }

    public boolean checkCart() {
        Date cartValidity = cart.getValidity();
        if (today.year > cartValidity.year){
            return false;
        }
        if (today.year == cart.getValidity().year & today.month > cartValidity.month){
            return false;
        }
        if (today.year == cart.getValidity().year & today.month == cartValidity.month
                & today.day == cartValidity.day){
            return false;
        }
        if (cart instanceof CartWithNumberOfHeave){
            if (cart.getNumberOfHeave() <= 0){
                return false;
            }
            cart.setNumberOfHeave(cart.getNumberOfHeave() - 1);
        }

        return true;
    }
}
