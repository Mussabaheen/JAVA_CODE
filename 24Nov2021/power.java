public class power {
    // 2^4 = 2*2*2*2 => 16
    //  a = 1 4
    // sum => 4 sum => 8 sum =>16
    // 2*2 => 4 *2 => 8 *2 => 16
    public static void main(String[] args) {
        int num = 4;
        int sum = 2;
        for (int a = 0; a < num - 1; a++) {
            sum = sum * 2;

        }
        System.out.println(sum);

        // System.out.println(Math.pow(sum, num));
    }
    
}
