package Ex_17;

import MyExceptionClasses.ExceptionA;
import MyExceptionClasses.ExceptionB;

import java.io.IOException;

public class Catching_Exceptions_With_Exception_Class_Test {

    public static void main(String[] args) {

        try {
            throw new ExceptionA();
        }
        catch (Exception e){
            System.out.println("Caught " + e.getClass().getSimpleName() + " using Exception block");
        }

        try {
            throw new ExceptionB();
        }
        catch (Exception e){
            System.out.println("Caught " + e.getClass().getSimpleName() + " using Exception block");
        }

        try {
            throw new NullPointerException();
        }
        catch (Exception e){
            System.out.println("Caught " + e.getClass().getSimpleName() + " using Exception block");
        }

        try {
            throw new IOException();
        }
        catch (Exception e){
            System.out.println("Caught " + e.getClass().getSimpleName() + " using Exception block");
        }

    }
}
