public class Zadanie1{
/*
    Exercise 1:
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, print to console true if one or the other is teen, but not both.
    Example:
    int a = 1;
    int b = 13;

    if a or b is "teen" print "teen"
 */

    public static void main (String[] args) {

        int a = 1;
        int b = 19;

        if ( ( a >= 13 && a <= 19 ) ||  ( b >= 13 && b <= 19 ) ) {
            System.out.println("teen");
        }else{
            System.out.println("not teen");
        }
    }
}
