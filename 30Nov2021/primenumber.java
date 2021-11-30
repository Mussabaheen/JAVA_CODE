public class primenumber {
    public static void main(String[] args) {
        boolean prime = true;

        //7
        // 2 - 7-1 => 2 - 6
        // 7%2 ==0
        // 7%3==0
        //7%6==0

        // 4
        // prime = true
        // 4%2 ==0
        // prime = false

        // 1 -100
        // 2 - 5

        // random number 
        // 2 - random number -> for loop
        
        for (int a = 1; a <= 100; a++) {
            prime = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    prime = false;
                }
            }
            if (prime == true) {
                System.out.println(a);
            }
        }
    }
}