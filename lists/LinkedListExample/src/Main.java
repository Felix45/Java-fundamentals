import com.sun.source.tree.LiteralTree;

import java.util.*;

public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int choice   = 0;
        boolean flag = true;

        LinkedList<Town> itineraryList = new LinkedList<>();
        itineraryList.add(new Town(0, "Nairobi"));
        Iterator iterator = itineraryList.listIterator();
        while(flag) {
            printActions();
            switch (choice = reader.nextInt()) {
                case 1 -> addTown(itineraryList);
                case 2 -> printTowns(itineraryList);
                default -> flag = false;
            }
        }
    }

    public static void addTown(LinkedList<Town> list) {
        reader.nextLine();
        System.out.println("Enter name of town:");
        String name = reader.nextLine();
        System.out.println("Enter distance from Adelaide:");
        double distance = reader.nextDouble();

        Iterator iterator = list.listIterator();
        if(iterator.hasNext()) {
            Town currentTown = (Town)iterator.next();
            if(currentTown.getNameOfTown().equalsIgnoreCase(name))
                return;
        }
        Town place = new Town(distance, name.trim());
        int matchIndex = 0;
        for(var listPlace: list) {
            if(place.getDistance() < listPlace.getDistance()) {
                list.add(matchIndex, place);
                return;
            }
            matchIndex++;
        }
        list.add(place);
        System.out.println(list);
    }

    public static void printTowns(LinkedList<Town> list) {
        int counter = 0;
        Iterator iterator = list.listIterator();
        System.out.println("Town: \t\t Distance from Adelaide:");
        System.out.println("*".repeat(50));
        while (iterator.hasNext()) {
          Town currentTown = (Town) iterator.next();
          System.out.printf("%d) %s %12.2f\n", ++counter, currentTown.getNameOfTown(), currentTown.getDistance());
        }
        System.out.println("*".repeat(50));
    }


    public static void printActions() {
        String textBlock = """
                1) - Add town to itinerary
                2) - Print all towns
                3) - Move fowards in list
                4) - Move backwards in list
                5) - Quit
                   - Enter a choice from the menu: 
                """;
        System.out.println(textBlock + " ");
    }
}

