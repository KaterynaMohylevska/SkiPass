package SkiPassCarts;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class CartForDays extends SkiPassCart{
    protected int numberOfDays;
    public CartForDays(int id, CartType cartType, Date validity, int numberOfDays) {
        super(id, cartType, validity);
        this.numberOfDays = numberOfDays;
    }
}
