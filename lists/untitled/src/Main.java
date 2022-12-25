import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput;
        ArrayList<String> groceryList = new ArrayList<>();
        int choice = 0;
        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("*".repeat(50));
            System.out.println("Enter a number for which action you want to do: ");
            System.out.println("*".repeat(50));
            System.out.println("0 - Shutdown");
            System.out.println("1 - to add items(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list) ");
            choice = reader.nextInt();
            reader.nextLine();
            System.out.println("*".repeat(50));

            switch (choice) {
                case 1:
                    System.out.println("Enter comma delimited list of grocery items to list:");
                    userInput = reader.nextLine();
                    String[] itemsToAdd = userInput.split(",");
                    for(String item: itemsToAdd) {
                        if(!groceryList.contains(item))
                            groceryList.add(item.trim());
                    }
                    break;
                case 2:
                    System.out.println("Enter comma delimited list of grocery items to remove:");
                    userInput = reader.nextLine();
                    String[] itemsToRemove = userInput.split(",");
                    for(String item: itemsToRemove) {
                        if(groceryList.contains(item))
                            groceryList.remove(item);
                    }
                    break;
            }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println("GroceryList: ---> "+groceryList+" size: "+groceryList.size());
        }while(choice != 0);
    }
}