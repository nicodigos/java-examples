public class Fifth {
    public static void main(String[] args) {
        try {
            float num0 = 10/2;
            int[] numbers = {7,8,0};
            int num = numbers[10];
            System.err.println(num0);
            System.err.println(num);
        } catch (ArithmeticException e) {
            System.err.println("No division by zero");
        } catch (Exception e) {
            System.err.println("No index " + e.getMessage());
        } finally {
            System.err.println("Out of the try catch");
        }

        try {
            CanVote(21);
        } catch(BellowAgeException e) {
            System.err.println("You can't vote because: " + e);
            
        }

        try {
            CanVote(16);
        } catch(BellowAgeException e) {
            System.err.println("You can't vote because: " + e);
            
        }      

    }

    public static void CanVote(int age) throws BellowAgeException {
        if (age < 18) {
            throw new BellowAgeException("You are less than 18!");
         } else {
            System.err.println("You can vote!");
         }
    }
}


class BellowAgeException extends Exception {
    public BellowAgeException(String message) {
        super(message);
    }
}