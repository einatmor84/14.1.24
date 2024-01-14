public class Main {
    public static void main(String[] args) {
        checkNum(-5);
    }
    public static void checkNum(int num){
        if (num < 1){
            throw new ArithmeticException("Number is negative, cannot calculate square");
        }else {
            System.out.println("square of: " + num +" is: " + num*num );
        }
    }
}