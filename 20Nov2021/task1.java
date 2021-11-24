public class task1 {
    public static void main(String[] args) {
                        
        String name = "aaaaaaaaassaasasasasasasasasasasasasasasAsASSsassadsadasasas";
        System.out.println(name.toUpperCase());
        String classfellow = "Khushdil hamza saad";
        System.out.println(classfellow.indexOf("hamza"));
        String firstname = "hamza";
        String secondname = "Sohail";
        System.out.println(firstname + " " + secondname);
        String text = "he is the world\s best programmer\n \t helllloooo";
        System.out.println(text);
        String num1 = "20";
        String num2 = "30";
        int num3 = 420;

        System.out.println(Math.random());

        String sfd = "0";
        sfd.length();
        
        int randomten = (int) (Math.random() * 10);
        System.out.println(randomten);

        // if(mussabeheen is going)
        // {
        //     hamza will go
        // }
        // else if(khushdil is going)
        // {
        //     hamza will go
        // }
        // else{
        //     hamza will not go
        // }
        int hamza = 36;
        int khushdil = 36;
        if(khushdil > hamza) // 36 > 36 -> False
        {
            System.out.println("Khushdil is mashar");
        }
        // else if (khushdil == hamza) {
        //     System.out.println("Khushdil and hamza ki age same hay");
        // }
        // else
        // {
        //     System.out.println("Hamza is mashar");
        // }
        
        int elder = hamza > khushdil ? hamza : khushdil;
    

        


        // System.out.println(num1+num2+num3);
        // System.out.println(num1+num2);
        
        
    }
}