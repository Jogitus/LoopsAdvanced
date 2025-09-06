import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
     
     //Harjoitus 1
//         int l1 = 0;
//         int l2 = 0;

//         System.out.println("First Number?");
//         l1 = Integer.parseInt(in.nextLine());
//         System.out.println("Last Number?");
//         l2 = Integer.parseInt(in.nextLine());
//     do{
//         System.out.println(l1);
//         l1++;
//     } while (l1 <= l2);

//Harjoitus2
        String vastaus = "Emma";
        String arvaus = "";
        int i = 0;

           do {
            System.out.println("Guess my name (type stop to exit)");
            arvaus = in.nextLine();
            if (arvaus.equals("stop")){
                break;
            }
            i++;
           } while (!arvaus.equals(vastaus));
           if(arvaus.equals(vastaus)){
            System.out.println("Congratulations!");
           }
    
           System.out.println("You guessed " + i + " times.");
            
    }
}
