import java.util.*;

public class ArrayLIst {
    public static void main(String[] args) {
        System.out.println("link of complet array list--");
        System.out.println("https://www.codewithharry.com/videos/java-tutorials-for-beginners-91/");
        ArrayList<Integer> l1 = new ArrayList<>();
        // add method
        l1.add(1);
        l1.add(2);
        l1.add(0);
        l1.add(3, 5); // inserts 5 at the 5th index in l1

        // get method

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        // get all element

        System.out.println(l1);

        // L1.remove(index number)

        l1.remove(3);
        System.out.println(l1);

        // contains() method is used to check if an ArrayList contains a specified
        // element or not. This method returns the boolean value.
        ArrayList<Integer> l2 = new ArrayList<>(List.of(1, 2, 0));
        // ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(1, 2, 0));

        System.out.println(l1.contains(0));
        System.out.println(l1.contains(l2));// return false
        System.out.println("l2 " + l2);

        // addAll() merge all othr list elements

        l1.addAll(l2);
        System.out.println(l1);

        // l1.size() arraylist size

        System.out.println(l1.size());

        // you can add the elements of l2 at the starting of l1 by typing :
        l1.addAll(0, l2);
        l1.addAll(2, l2); // Adds elements of l2 starting at index 2
        System.out.println(l1);

        // Indexof()

        int index = l1.indexOf(0);// catch the first index only
        System.out.println(index);

        // lastIndexOf() //catch the last occurence of index
        System.out.println(l1.lastIndexOf(0));
        ArrayList<Integer> l3 = new ArrayList<>();
        l3 = (ArrayList<Integer>) l1.clone();
        System.out.println(l3);

        // l1.remove(2); // Removes the element at index 2
        l1.remove(0);
        System.out.println("l1" + l1);

        // array to array list
        Integer[] arr = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
        System.out.println(a);
    }
}
