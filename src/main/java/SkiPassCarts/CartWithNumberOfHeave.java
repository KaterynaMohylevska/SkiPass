package SkiPassCarts;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class CartWithNumberOfHeave extends SkiPassCart {
    protected int numberOfHeave;
    public CartWithNumberOfHeave(int id,CartType cartType, Date validity, int numberOfHeave){
        super(id,cartType,validity);
        this.numberOfHeave = numberOfHeave;
    }
    public int getNumberOfHeave() {
        return numberOfHeave;
    }
    public void setNumberOfHeave(int numberOfHeave) {
        this.numberOfHeave = numberOfHeave;
    }

    public void addNumberOfHeave(int numberOfHeave){
        this.numberOfHeave += numberOfHeave;
    }

}
