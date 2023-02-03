public class Main {
    public static void main(String[] args) {
        if (Armstrong(123)) {
            System.out.println("The number is Armstrong");
        }
        else {
            System.out.println("The number cannot be Armstrong");
        }
    }

    public static boolean Armstrong( int theNumber) {
        int counter = 1;
        boolean isArmstrong = false;
        int theNumber1 = theNumber;
        int s = 0;
        int number1;
        int finder = 10;
        int sum = 0;
        int result = 0;
        while (theNumber / finder != 0) {
            finder = finder * 10;
            counter++;
        }
        int h = counter;

        for (; theNumber != 0; theNumber = theNumber / 10) {
            result = theNumber % 10;
            number1 = result;
            for (; counter > 1; counter--) {
                result = number1 * result;
            }
            sum += result;
            counter = h;
        }
        if (sum == theNumber1) {
            isArmstrong = true;
            return isArmstrong;
        }
        return isArmstrong;
    }
}
