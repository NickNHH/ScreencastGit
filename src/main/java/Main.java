import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user after his input
        System.out.print("Enter some input: ");
        String input = scanner.nextLine();

        // Reverse the user input
        String reversedName = String.valueOf(new StringBuilder(input).reverse());

        // Print reversed input
        System.out.println("Your input in reverse is: " + reversedName);
        System.out.println();
    }
}
