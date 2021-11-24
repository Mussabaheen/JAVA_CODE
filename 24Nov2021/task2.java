public class task2 {
    // Write a java program to find those numbers which are divisible by 2 and multiple of 5, between 2500 and 3500
    public static void main(String[] args) {
        for (int a = 2500; a <= 3500; a++) {
            if (a % 2 == 0 && a % 5 == 0) {
                System.out.println(a);
            }

        }
        
    }
    
}
