import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        charToInt('k', 'm', 'p', 'H');
        int[] arr1 = new int[4];
        System.out.println(Arrays.toString(charToInt('k', 'm', 'p', 'H')));
        intToChar(arr1);
        arr1 = charToInt('k', 'm', 'p', 'H');
        System.out.println(Arrays.toString(intToChar(arr1)));

    }

    static int[] charToInt(char... arr) {
        int[] arr1 = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            arr1[k] = arr[k];
        }
        return arr1;
    }
    static char[] intToChar(int... arr1) {
        char[] arr3 = new char[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = (char)arr1[i];

        }
        return arr3;
    }
}