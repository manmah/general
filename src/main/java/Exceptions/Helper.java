package Exceptions;

public class Helper {

    public static Integer Calculator(int x , int y) throws NumberException {
        if(y == 0)
            throw new NumberException("cannot divide by zero" , x + "/" + y);
        return x/y;
    }
}
