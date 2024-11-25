import java.util.Scanner;

public class Customer {
    String[] customer = new String[5];

    Scanner scanner = new Scanner(System.in);
    String firstName, lastName;
    public void inputCustomerData() {

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter first name for customer " + (i + 1) + ": ");

            firstName = scanner.nextLine().trim();

          while(firstName.isEmpty()) {
              System.out.println("Customer's first name cannot be empty");
             break;
          }
            System.out.println("Enter first name for customer " + (i + 1) + ": " + firstName);
//            scanner.nextLine();

            System.out.print("Enter last name for customer " + (i + 1) + ": ");
            lastName = scanner.nextLine().trim();
          while(lastName.isEmpty()) {
              System.out.println("Customer's last name cannot be empty");
              break;
          }
            System.out.println("Enter last name for customer " + (i + 1) + ": " + lastName);
//            scanner.nextLine();

            customer[i] = firstName + " " + lastName;
        }


    }

    public void displayCustomerData() {
        System.out.println("Customer List: ");
        for (String eachCustomer : customer) {
            System.out.println(eachCustomer);
        }
    }



}
