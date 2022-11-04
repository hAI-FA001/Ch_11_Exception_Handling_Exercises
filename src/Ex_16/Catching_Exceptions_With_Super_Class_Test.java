package Ex_16;

import MyExceptionClasses.ExceptionA;
import MyExceptionClasses.ExceptionB;
import MyExceptionClasses.ExceptionC;

public class Catching_Exceptions_With_Super_Class_Test {

    public static void main(String[] args) {
        try{
            throw new ExceptionB();
        }
        catch(ExceptionA e){
            System.out.println("Caught " + e.getClass().getSimpleName() + " using ExceptionA catch block");
        }

        try{
            throw new ExceptionC();
        }
        catch(ExceptionA e) {
            System.out.println("Caught " + e.getClass().getSimpleName() + " using ExceptionA catch block");
        }
    }
}
