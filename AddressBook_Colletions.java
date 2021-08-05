import java.util.*;

public class AddressBook_Colletions {
    public static void main(String[] args) {
        contacts();

        System.out.println("-------Welcome to Address Book Problem -----------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        final String first = scan.nextLine();
        System.out.println("Enter Last Name");
        String last = scan.nextLine();
        System.out.println("Enter Address");
        String address = scan.nextLine();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter State");
        String state = scan.nextLine();
        System.out.println("Enter Zip Code");
        String zip = scan.nextLine();
        System.out.println("Enter Phone Number");
        String mobileNo = scan.nextLine();
        System.out.println("Enter E-mail");
        String email = scan.next();
        ArrayList<String> list = new ArrayList<String>();  //Creating arraylist
        list.add(first);            //Adding object in arraylist
        list.add(last);
        list.add(address);
        list.add(city);
        list.add(state);
        list.add(zip);
        list.add(mobileNo);
        list.add(email);

        System.out.println(list);
        System.out.println(contactsList);
    }
    // Add a New Contact in AddressBook

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> contactsList = new ArrayList<String>();


    public static void contacts() {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Enter your choice: 1)Enter original Contact details\n 2)addNewContact: \n");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    quit = true;
                    break;
                case 2:
                    addContact();
                    break;
                default:
                    break;
            }
        }

    }

    public static void addContact() {
        System.out.println("Enter the first name of the new contact");
        String fname = scanner.nextLine();
        System.out.println("Enter the last name of the new contact");
        String lname = scanner.nextLine();
        System.out.println("Enter the Address of the new contact");
        String addr = scanner.nextLine();
        System.out.println("Enter the City of the new contact");
        String city1 = scanner.nextLine();
        System.out.println("Enter the State of the new contact");
        String state1 = scanner.nextLine();
        System.out.println("Enter the Mobile Number of the new contact");
        String mobNum = scanner.nextLine();
        System.out.println("Enter the Zip of the new contact");
        String zip = scanner.nextLine();
        System.out.println("Enter the Email of the new contact");
        String email = scanner.nextLine();

        contactsList.add(fname);
        contactsList.add(lname);
        contactsList.add(addr);
        contactsList.add(city1);
        contactsList.add(state1);
        contactsList.add(zip);
        contactsList.add(mobNum);
        contactsList.add(email);
        System.out.println(contactsList);
    }
}