package com.test1;

public class Passenger extends Flight{
    private int freeBags;
    private int checkedBags;
    private double feePerBag;

    //static variables block
    {
        freeBags = 2;
        checkedBags = 0 ;
        feePerBag = checkedBags >freeBags? 50:25;
    }

    public Passenger(int freeBags){
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags , int checkedBags){
        this(freeBags);
        this.checkedBags= checkedBags;
    }
    public Passenger(double feePerBag){
        this.feePerBag = feePerBag;
    }

    public int getFreeBags() {
        return freeBags;
    }


    public int getCheckedBags() {
        return checkedBags;
    }

    public double getFeePerBag() {
        return feePerBag;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "freeBags=" + freeBags +
                ", checkedBags=" + checkedBags +
                ", feePerBag=" + feePerBag +
                '}';
    }

}
