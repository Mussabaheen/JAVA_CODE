public class patterns {
    public static void main(String[] args) {
        
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b <= 5; b++) {
                if (a <= b)
                {
                    System.out.print(" ");

                }
                else {
                    System.out.print("#");

                }
            }
            System.out.print("\n");
        }
    }
    
}
