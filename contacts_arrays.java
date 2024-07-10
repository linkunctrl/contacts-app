import java.util.*;

public class contacts_arrays{
    // arraylists can grow or shrink in size while arrays have a unchanged size
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] contacts = new String[5];
        int count = 0;


        while(true){
            System.out.println("\nContact List Options:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option: \n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1: 
                if ( count < contacts.length){
                    System.out.println("Enter contact name: ");
                    contacts[count] = scanner.nextLine();
                    count++;
                }
                else {
                    System.out.println("Contact list is full!");
                }
                break;

                case 2:
                System.out.println("Contacts:");
                for ( int i = 0;   i < count; i++){
                    System.out.println((i+1) + "." + contacts[i]);
                }
                break;

                case 3:
                System.out.println("Goodbye!");
                scanner.close();

                return;
            default:  System.out.println("Invalid option. Try again.");

            }
        }
    }
}