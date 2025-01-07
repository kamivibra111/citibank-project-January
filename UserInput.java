import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your name: ");
//        String name = input.nextLine();
//        System.out.println("welcome and Good Morning " + name +".");
        System.out.print("Enter a number: ");
        int int1 = input.nextInt();
        System.out.print("Enter another number: ");
        int int2 = input.nextInt();
        int sum = int1 + int2;
        System.out.print("The sum is: "+ sum);

    }
}
