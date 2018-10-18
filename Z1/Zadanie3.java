public class Zadanie3 {
/*
    Exercise 3:
    Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    Example:
    int[] array = {3,2,14,1,2,3,6};

    should print true
*/

    public static void main (String[] args) {
        int[] array = {3, 2, 14, 1, 2, 3, 6};
        boolean found = false;


        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1 ){
                if ( i+1 < array.length && array[i+1] == 2 ){
                    if (i+2 < array.length && array[i+2] ==3 ){
                        found = true;
                    }
                }
            }

        }

        if (found){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}
