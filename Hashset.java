import java.util.HashSet;
public class Hashset {
    


    public static void main(String[] args) {
        // Create a HashSet to store integers
        HashSet<Integer> numbersSet = new HashSet<>();

        // Adding elements to the HashSet
        numbersSet.add(5);
        numbersSet.add(10);
        numbersSet.add(15);
        numbersSet.add(20);
        numbersSet.add(25);

        // Trying to add a duplicate element (it won't be added)
        numbersSet.add(10);

        // Displaying the HashSet
        System.out.println("HashSet elements: " + numbersSet);

        // Checking if an element exists in the HashSet
        int numberToCheck = 15;
        if (numbersSet.contains(numberToCheck)) {
            System.out.println(numberToCheck + " exists in the HashSet.");
        } else {
            System.out.println(numberToCheck + " does not exist in the HashSet.");
        }

        // Removing an element from the HashSet
        int numberToRemove = 20;
        if (numbersSet.remove(numberToRemove)) {
            System.out.println(numberToRemove + " removed from the HashSet.");
        } else {
            System.out.println(numberToRemove + " does not exist in the HashSet, so it cannot be removed.");
        }

        // Size of the HashSet
        System.out.println("Size of the HashSet: " + numbersSet.size());

        // Clearing all elements from the HashSet
        numbersSet.clear();

        // Checking if the HashSet is empty after clearing
        if (numbersSet.isEmpty()) {
            System.out.println("HashSet is empty now.");
        } else {
            System.out.println("HashSet still contains elements.");
        }
    }
}


