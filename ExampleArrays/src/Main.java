import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomNumbers = getRandomNumbers(10);
        System.out.println("Before sorting: "+Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers);

        int[] reversedArray = reverseCopy(randomNumbers);
        System.out.println("After sorting and reversing:  "+Arrays.toString(reversedArray));
    }

    public static int[] getRandomNumbers(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for(int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    public static int[] reverseCopy(int[] arrayCopy) {
        int[] newArray = new int[arrayCopy.length];
        int rightIndex = arrayCopy.length - 1;

        for(int element : arrayCopy) {
            newArray[rightIndex--] = element;
        }
        return newArray;
    }
}