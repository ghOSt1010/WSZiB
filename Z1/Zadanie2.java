public class Zadanie2 {
/*
    Exercise 2:
    Given 3 int values, a b c, print to console their sum.
    However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.
    Example:
    int a = 1;
    int b = 13;
    int c = 2;
s
    should print 1s
*/

    public static void main (String[] args) {

        int a = 1;
        int b = 13;
        int c = 2;
        int sum = 0;

        if ( a != 13 ){
            sum += a;
        }
        if ( b != 13 ){
                sum += b;
        }
        if ( c !=13 ){
            sum += c;
        }

        System.out.println("Suma to: " + sum);
    }
}
