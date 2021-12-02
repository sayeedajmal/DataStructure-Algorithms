import java.util.Scanner;

class Array_Insertion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Elements you wanna Add! ");
        int n = input.nextInt();

        System.out.println("Enter " + n + " Elements: ");
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Showing output");
        SHOW(n, array);

        /* ============================getting input like number and index */

        System.out.print("Enter index Where you wanna Insert new Element: ");
        int pos = input.nextInt();

        System.out.print("Enter The Element you wanna add!:  ");
        int new_element = input.nextInt();

        System.out.println("<================inserted number===================>");
        array = INSERTION(n, array, new_element, pos);

        /* SHOWING OUTPUT AFTER INSERTING ELEMENT */

        SHOW(n, array);

        input.close();
    }

    /* SHOWING OUTPUT */
    public static void SHOW(int n, int array[]) {
        System.out.println("<==============================================>");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
    /* INSERTION */
    // Function to insert x in arr at position pos

    public static int[] INSERTION(int n, int array[], int new_element, int pos) {

        // create a new array of size n+1, because of adding new element.

        int new_array[] = new int[n + 1];

        // insert the elements from

        // the old array into the new array

        for (int i = 0; i < n + 1; i++) {
            // insert all elements till pos
            if (i < pos - 1) {
                new_array[i] = array[i];

                // then insert new_element at pos
            } else if (i == pos - 1) {
                new_array[i] = new_element;

                // then insert rest of the elements
            } else {
                new_array[i] = array[i - 1];
            }

        }
        return new_array;
    }

    /* DELETION */
    public static void DELETION(int n, int array[]) {
       /* create a new array of size n */
    }

    /* REPLACING */
    public static void REPLACING(int n, int array[]) {
        System.out.println("This section for REPLACING of Particular Element");
    }

    /* SEARCHING */
    public static void SEARCHING(int n, int array[]) {
        System.out.println("This section for SEARCHING of Particular Element");
    }
}