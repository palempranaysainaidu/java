public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int result;

        try {
            result = numbers[1] / 0;
            System.out.println("Result: " + result);
            System.out.println(numbers[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block executed. Cleanup can be done here.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
