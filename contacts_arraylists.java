import java.util.*;
public class contacts_arraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> contacts = new ArrayList<>();

        while (true){
            System.out.println("\nContact List Options:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: \n");

            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){

                case 1:
                System.out.print("Enter contact name: ");
                    contacts.add(sc.nextLine());
                    break;

                case 2:
                System.out.println("Contacts:");
                for ( int i = 0; i < contacts.size() ; i++){
                    System.out.println((i+1) + "." + contacts.get(i));
                }   
                break;

                case 3:
                System.out.print("Enter contact name to delete: ");
                String deletecontact = sc.nextLine();
                
                if (contacts.remove(deletecontact)){

                    System.out.println("Contact deleted.");
                } else {
                    System.out.println("Contact not found.");
                }
                break;
                
                case 4:
                System.out.println("Enter contact name to search: " );
                String searchcontact = sc.nextLine();

                if (contacts.contains(searchcontact)) {
                    System.out.println("Contact found.");
                } else {
                    System.out.println("Contact not found.");
                }
                break;
                
                case 5:
                System.out.println("Goodbye!");
                sc.close();
                return;
                
                default : System.out.println("Invalid option. Try again.");
            }
        }
    
    }
}
