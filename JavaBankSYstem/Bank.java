import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How Much Coustomer You wnat to enter: ");
        int n = sc.nextInt();
        BankDetails C[] = new BankDetails[n];

        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].createAccount();
        }

        // Loop untils 5 is Not Pressed To Exit The System.
        int choice;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println(
                    "1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.println("Enter Account No You want to Search: ");
                    String accno = sc.next();
                    boolean found = false;

                    for (int i = 0; i < C.length; i++) {
                        found = C[i].Search(accno);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed!\nAccount Desen't Exist!");
                    }

                case 3:
                    System.out.println("Enter Your Account No: ");
                    accno = sc.next();
                    found = false;

                    for (int i = 0; i < C.length; i++) {
                        found = C[i].Search(accno);
                        if (found) {
                            C[i].diposite();
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Found Failed\nAccount Dosen't Exists!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Your Account No: ");
                    accno = sc.next();
                    found = false;

                    for (int i = 0; i < C.length; i++) {
                        found = C[i].Search(accno);
                        if (found) {
                            C[i].withDraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Found Failed\nAccount Dosen't Exists!");
                    }

                case 5:
                    System.out.println("See You Soon!");

                default:
                    System.out.println("Invalid Input!!!");
                    break;
            }

        } while (choice != 5);

    }
}

class BankDetails {
    private String accno;
    private String name;
    private String accType;
    private long balance;

    // Creating a SCANNER Obj
    Scanner sc = new Scanner(System.in);

    // 1. Method to Create an Account
    public void createAccount() {
        System.out.println("Enter Your Account No: ");
        accno = sc.next();

        System.out.println("Enter Your Name: ");
        name = sc.next();

        System.out.println("Enter Your Account Type: ");
        accType = sc.next();

        System.out.println("Enter Your Balance: ");
        balance = sc.nextLong();
    }

    // 2. Method to Show The Account Details
    public void showAccount() {
        System.out.println("The Name of The account Holder -> " + name);
        System.out.println("The account Number -> " + accno);
        System.out.println("The account Type -> " + accType);
        System.out.println("The Balance is -> " + balance);
    }

    // 3. Method to Diposite Money
    public void diposite() {
        long amount;
        System.out.println("Enter How Much Amount you want to add: ");
        amount = sc.nextLong();
        balance = balance + amount;
    }

    // 4. Method to Withdraw The Amount
    public void withDraw() {
        long amount;
        System.out.println("Enter How much Amount You want to Withdraw: ");
        amount = sc.nextLong();

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Now Your Account Balance is ->" + balance);
        } else {
            System.out.println("OOp's Your Account Balance is less than " + amount + " Transition Failed!");
        }
    }

    // 5. Method To Search The Account
    public boolean Search(String accno) {
        if (accno.equals(accno)) {
            showAccount();
            return (true);
        }
        return (false);
    }

}
