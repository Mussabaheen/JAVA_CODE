public class forLoops {
    public static void main(String[] args) {
        int a = 0;
        for (a = 0; a < 3; a++) {
            System.out.println(a);
        }
        System.out.println(a);
        // a=0; 0<3 print(0) a=1
        // 1<3; print)(1) a=2
        // 2<3 print(2) a=3
        // 3<3 

        // 0 1 2 
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        // 0
        // 2
        // 4
        // 6
        // 8
        // 10
    }
    
}
