package Exceptions;

public class NumberException extends Throwable  {

    public NumberException(String reason, String statemenet){
        super(reason + " : " +  statemenet);
    }

    public  NumberException(String reason , String statement , Throwable cause){
        super(reason + " : " + statement , cause);
    }
}
