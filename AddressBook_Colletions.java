import java.util.*;

public class AddressBook_Colletions {
    public static void main(String args[]) {
        System.out.println("-------Welcome to Address Book Problem -----------");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Name");
        String first = scan.nextLine();
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
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add(first);//Adding object in arraylist
        list.add(last);
        list.add(address);
        list.add(city);
        list.add(state);
        list.add(zip);
        list.add(mobileNo);
        list.add(email);

        System.out.println(list);

    }
}
