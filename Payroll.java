import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mainChoice;
        
        do {
            System.out.println("\n=== Welcome to Semicolon Employee payroll ===");
            System.out.println("1. Add Employee payroll");
            System.out.println("2. View employee payroll");
            System.out.println("3. Update employee payroll");
            System.out.println("0. Exit");
            System.out.print("Select a menu option (0-3): ");
            
            mainChoice = scanner.nextInt();
            
            switch (mainChoice) {
                 case 1:
                    System.out.println("\n-- Add Employee Payroll --");
                    System.out.println("1. Add Employee name");
                    System.out.println("2. Enter Number of hours worked");
                    System.out.println("3. Enter hour pay rate");
                    System.out.println("4. Enter federal tax rate");
                    System.out.println("5. Enter state tax rate");
                    System.out.print("Select an option: ");
                    int phonebookChoice = scanner.nextInt();
                    break;                 


		 case 2:
                    System.out.println("\n-- View Employee payroll --");
                    break;
                 case 3:
                    System.out.println("\n-- Update Employee payroll --");
                    break;
                case 0:
                    System.out.println("\nExiting... Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid option. Please select between 0 and 3.");
            }
        } while (mainChoice != 0);

       
    }
}

