public class task1 {
//     You're writing a program to play a variety of BlackJack. In general, given two numbers, a and b, return their sum.

// If the sum is greater than 21, return 0, unless one of the numbers is 11. In such a case, 
// the 11 should be 'converted' to a 1 to prevent the sum from being exceeded.
public static void main(String[] args) {
    int a =11;
    int b = 13;
    int sum = a + b;
    System.out.println("sum: " + sum);
    
    if (sum > 21) {
        if (a == 11) {
            a = 1;
            sum = a + b;
            System.out.println(sum);
        } else if (b == 11) {
            b = 1;
            sum = a + b;
            System.out.println(sum);
        } else {
            System.out.println("0");

        }

    }
    else {
        System.out.println("sum: "+sum);
    }

        

        
    }
}