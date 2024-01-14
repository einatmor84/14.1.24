import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("C:\\folder\\text.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

/*
       int [] array = new int[5];

       try {
           for (int i = 0; i <= array.length; i++) {
               array[i] = i;
               System.out.println(array[i]);
           }
       }catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("============================================");
           System.out.println("ArrayIndexOutOfBoundsException has occurred");
           System.out.println("============================================");
       }
       finally {
           System.out.println("finally block executed");
       }
*/

        System.out.println(divide(3, 0)); //Error from divideByZero function!

    }
    public static int divide(int a , int b){
        System.out.println("before the error");
        int  res = 0 ;
        try {
            res = a / b;  // Error
        }
        catch (ArithmeticException exeption)
        {
            System.out.println("============================================");
            System.out.println("ArithmeticException Exception has occurred");
            System.out.println("============================================");
        }
        finally {
            System.out.println("finally block always work");
        }
        return  res;
    }
}
