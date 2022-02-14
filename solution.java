import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        
        String username, password, response;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Your username: ");
        username = input.nextLine();
        
        System.out.print("Your password: ");
        password = input.nextLine();
        
        if (username.equals("patika") && password.equals("java123")) {
            System.out.print("You entered!");
        } else {
            if (!username.equals("patika")) {
                System.out.print("Your username is wrong!");
            } else if (!password.equals("java123")) {
                System.out.print("Your password is wrong!");
                System.out.print("Do you want to reset your password? ");
                response = input.nextLine();
                if (response.equals("Y")) {
                     System.out.print("Your new password: ");
                     password = input.nextLine();
                     if (!password.equals("java123")) {
                         System.out.print("Your new password has been created!");
                     } else {
                         System.out.println("Your new password has not been created!");
                         System.out.print("Please enter another password!");
                     }
                }
            }
    }
}
}
