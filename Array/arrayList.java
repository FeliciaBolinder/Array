import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        int t=1;

        do {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter a number: ");

           int nmbr = myObj.nextInt();  // Read user input

            myNumbers.add(nmbr);

            t++;

        } while (t<6); //repeats 5 times


        Collections.sort(myNumbers, Collections.reverseOrder());
        // Sort myNumbers, print out list
        System.out.println("Order:");
        for (int i : myNumbers) {

            System.out.println(i);
        }
    }
}