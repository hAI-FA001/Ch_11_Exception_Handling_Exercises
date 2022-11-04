package Ex_19;

import Other_Classes.SomeClass;

public class Constructor_Failure_Test {

    public static void main(String[] args) {

        try {
            new SomeClass();
        }
        catch(IllegalArgumentException e){
            System.out.println("Caught " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
        }
    }
}
