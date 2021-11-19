public class table {
    public static void main(String[] args) {
        int[] table = { 1,10 };
        table_calculator(table);
    }

    public static void table_calculator(int[] arr) {
        //[1,3,4,5,6,7,8324,324]



        
        for (int i = 0; i < arr.length; i++)
        {
            for (int a = 0; a <= 10; a++) {
                int res = a * arr[i];
                System.out.println(res);
            }
        }
    
        
    }
    
}
