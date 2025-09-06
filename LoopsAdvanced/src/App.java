import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int l1 = 0;
        int l2 = 0;

        System.out.println("First Number?");
        l1 = Integer.parseInt(in.nextLine());
        System.out.println("Last Number?");
        l2 = Integer.parseInt(in.nextLine());
    do{
        System.out.println(l1);
        l1++;
    } while (l1 <= l2);
}
}
