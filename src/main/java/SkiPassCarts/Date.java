package SkiPassCarts;

/**
 * Created by cs.ucu.edu.ua on 28.11.2016.
 */
public class Date {
    public int day;
    public int month;
    public int year;
    public Date(int day, int month,int year){
        this.day = day;
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}
