package Ex_20;

import java.util.Arrays;

public class Rethrowing_Exceptions_Test {

    public static void main(String[] args) {

        double[] someArrayOfDoubles = new double[10];

        for(int i=0; i < someArrayOfDoubles.length; i++)
            someArrayOfDoubles[i] = (2*i+1);

        try {
            System.out.println();
            System.out.println(computeAverage(someArrayOfDoubles));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught " + e.getClass().getSimpleName());
            System.out.println("Message: " + e.getMessage());
            System.out.println("\nStack Trace");
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    static double computeAverage(double[] arrayToCalculateAverageOf){
        double sum = 0;

        try{
            for(int i=0; i <= arrayToCalculateAverageOf.length; i++)
                sum += arrayToCalculateAverageOf[i];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside computeAverage() catch block");
            System.out.println();
            throw e;
        }

        return sum / arrayToCalculateAverageOf.length;
    }
}
