import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user after his name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Reverse the user name
        String reversedName = String.valueOf(new StringBuilder(name).reverse());

        // Print reversed name
        System.out.println("Your name in reverse is: " + reversedName);

        // Print goodbye message
        System.out.println("See ya later, alligator!");
    }
}
