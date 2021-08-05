import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

        class AddressBook_Collections {
            private static ArrayList<String> contactsList = new ArrayList<>();
            private static Scanner scanner = new Scanner(System.in);


            public static void main(String[] args) {
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
//
//                Iterator<String> itObjectForList = list.iterator();
//                        while (itObjectForList.hasNext()) {
//                            System.out.println(itObjectForList.next());
//                        }
// doesn't allow for duplicate entries
                        System.out.println("After converting into set ----");

                        Set<String> set = new HashSet<String>(list);
                        Iterator<String> itObjectForSet = set.iterator();
                        while (itObjectForSet.hasNext()) {
                            if(itObjectForSet.equals(list.containsAll(contactsList))){
                                System.out.println(itObjectForSet);
                            }else
                            System.out.println(itObjectForSet.next());
                        }
                System.out.println(set);
                    }
                }
