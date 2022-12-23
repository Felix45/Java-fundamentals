import java.util.Arrays;

public class ExampleArrays {
    public static void main(String[] args) {
        int[] randomNumbers = getRandomNumbers(10);
        System.out.println('Before sorting: '+Arrays.toString(randomNumbers));

        Arrays.sort(randomNumbers);
        System.out.println('After sorting: '+Arrays.toString(randomNumbers));

    }

    public static int[] getRandomNumbers(int length) {
        Random random = new Random();
        int[] randomArray = new int[length];
        for(int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt();
        }
        return randomArray;
    }
}