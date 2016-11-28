package SkiPassCarts;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class SkiPassCart {
    protected int id;
    protected CartType cartType;
    protected Date validity;
    protected int numberOfHeave = 0;

    public SkiPassCart(int id,CartType cartType, Date validity){
        this.id = id;
        this.cartType = cartType;
        this.validity = validity;
    }

    public CartType getCartType() {
        return cartType;
    }

    public Date getValidity() {
        return validity;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfHeave() {
        return numberOfHeave;
    }
    public void setNumberOfHeave(int numberOfHeave) {
        this.numberOfHeave = numberOfHeave;
    }

    public void changeValidity(Date validity){
        this.validity = validity;
    }

}
