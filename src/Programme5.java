import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme5 {

    public static void main(String[] args) {
        String arr[] = { "Purple", "Red","Orange","Green","Yellow"};
        List aList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            aList.add(arr[i]);
        }
        ListIterator< String > itr = aList.listIterator();
        System.out.println("\nUsing List Iterator:");
        while (itr.hasNext()) {
            System.out.println("colour is : " +
                    itr.next());
        }
    }
}
