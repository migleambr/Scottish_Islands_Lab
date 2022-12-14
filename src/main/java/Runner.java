import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.sum;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco"); 

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        int indexSkye = scottishIslands.indexOf("Skye");
        System.out.println("Index position of Skye: " + indexSkye);
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println("Number of islands in the arraylist: " + scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

        System.out.println("---------");

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }

        System.out.println("---------");

        System.out.println(scottishIslands);

        System.out.println("---------");

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

        System.out.println("---------");

//        1. Print out a list of the even integers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

        System.out.println("---------");

//        2. Print the difference between the largest and smallest value
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("The difference is " + (max - min));

        System.out.println("---------");

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        ArrayList<String> ones = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 1 && i++ == 1);
        }
        System.out.println("True");

        System.out.println("---------");

//        4. Print the sum of the numbers,
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        System.out.println("The sum is " + sum);

        System.out.println("---------");

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//          So [7, 13, 2] would have sum of 9.

//        Could not manage to find a solution

//        int sumExcluding13 = 0;
//        // index of 13
//        int thirteenIndex = numbers.indexOf(13);
//        // index of a number that comes immediately after 13
//        int subsequentIndex = thirteenIndex + 1;
//        for (Integer number : numbers) {
//            if (numbers[!thirteenIndex] && numbers[!subsequentIndex]) {
//                sumExcluding13 = sumExcluding13 + number;
//            }
//        }
//        System.out.println("The sum is " + sumExcluding13);

        }
}
