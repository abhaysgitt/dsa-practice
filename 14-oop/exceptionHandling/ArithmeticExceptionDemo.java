public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            ExceptionHandlingDemo.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
