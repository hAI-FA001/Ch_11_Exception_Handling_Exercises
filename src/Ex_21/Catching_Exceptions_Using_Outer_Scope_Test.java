package Ex_21;

public class Catching_Exceptions_Using_Outer_Scope_Test {

    public static void main(String[] args) {

        try{
            accessBeyondBounds(new Object[]{1, 2, 3});
        }
        catch(ArithmeticException e){
            System.out.println();
            System.out.println("Caught " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }

    static void accessBeyondBounds(Object[] someObjectArray){

        boolean causeDivByZero = true;

        try{
            someObjectArray[someObjectArray.length] = 1/ (causeDivByZero? 0 : 1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught " + e.getClass().getSimpleName() + " in accessBeyondBounds()");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
