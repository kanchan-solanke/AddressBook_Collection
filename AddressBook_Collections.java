import java.util.*;

public class AddressBook_Collections {


    public static void main(String[] args) {
        List<String> contactsList = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
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
            // To delete Personal details using person's name
        System.out.println("enter First name to delete details:");
        String name = scanner.nextLine();

        for (int i=0; i < contactsList.size(); i++)
        {
            String personName = contactsList.get(i);

            if (name.equals(personName))
            {
                contactsList.removeAll(contactsList);
                System.out.println("this person details is deleted");
                System.out.println("After delete person's details"+contactsList);
                break;
            }
            else
                System.out.println("please enter valid name");
        }
            }
    }
