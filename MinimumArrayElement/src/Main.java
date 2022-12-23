import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] readNumbers = readIntegers();
        System.out.println("User Input: " + Arrays.toString(readNumbers));
        System.out.println("Minimum: " + findMin(readNumbers));
    }

    public static int findMin(int[] numbersArray) {
      int min = Integer.MAX_VALUE;

      for(int element : numbersArray) {
          if(element < min) {
              min = element;
          }
      }
      return min;
    }

    public static int[] readIntegers() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a comma separated list of integers from the keyboard:");
        String numbers = reader.nextLine();

        String[] userInput = numbers.split(",");
        int[] numbersInput = new int[userInput.length];

        for(int i = 0; i < userInput.length; i++) {
            numbersInput[i] = Integer.parseInt(userInput[i]);
        }
        return numbersInput;
    }
}