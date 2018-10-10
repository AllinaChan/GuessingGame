import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner name = new Scanner (System.in);
        System.out.println("Hello user! What is your name?");
        String userName= name.nextLine();
        System.out.println("Hello "+ userName+ ", nice to meet you!");

    }
}

