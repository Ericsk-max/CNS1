import java.util.Scanner;

public class details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Year of Birth (YOB): ");
        int yob = scanner.nextInt();

        System.out.print("Enter Admission Number: ");
        String admNo = scanner.next();

        scanner.close();

        System.out.println("\nUser Details:");
        System.out.println("First Name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
        System.out.println("Year of Birth: " + yob);
        System.out.println("Admission Number: " + admNo);
    }
}
