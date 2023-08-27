import java.util.Scanner;

class BankDetails {

    private String accno;
    private String acc_type;
    private String name;
    private long balance;

    Scanner sc = new Scanner(System.in);

    // 1. Creating a Class OpenAccount
    public void OpenAccount() {
        System.out.println("Enter Your Account No: ");
        accno = sc.next();

        System.out.println("Enter Your Account Type: ");
        acc_type = sc.next();

        System.out.println("Enter Your Name: ");
        name = sc.next();

        System.out.println("Enter Your Balence: ");
        balance = sc.nextLong();
    }

    // 2. Display The account Detials
    public void showAccount() {
        System.out.println("Name of the account holder -> " + name);
        System.out.println("Name of The account No is -> " + accno);
        System.out.println("Your account Type is -> " + acc_type);
        System.out.println("Your Account Type is -> " + balance);
    }

    // 3. Diposite Money
    public void diposite() {
        long amount;
        System.out.println("Enter The amount you want to diposite: ");
        amount = sc.nextLong();
        balance = balance + amount;
    }

    // 4. withdraw Money
    public void withdraw() {
        long amount;
        amount = sc.nextLong();
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Account Balence after withdraw = " + balance);
        } else {
            System.out.println("Your Account balence is less than " + amount + "Transition Faield!");
        }
    }

    // 5. Search Account No.

    public boolean search(String accno) {
        if (accno.equals(accno)) {
            showAccount();
            return (true);
        } else {
            return (false);
        }
    }

}

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Custormer You Want To enter: ");
        int n = sc.nextInt();

        int choice;
        
        BankDetails c[] = new  BankDetails[n];

        for (int i = 0; i < c.length; i++) {
            c[i] = new BankDetails();
            c[i].OpenAccount();
        }

        do {
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            choice = sc.nextInt();  


            switch (choice) {
                case 1:
                    for (int i = 0; i < c.length; i++) {
                        c[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.println("Enter The account No. You wnat to Enter: ");
                    String accno = sc.next();
                    boolean found = false;

                    for (int i = 0; i < c.length; i++) {
                        found = c[i].search(accno);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Accound Failed! Account Dosen't exist!");
                    }break;
            
                default:
                    break;
            }


        } while (choice != 5);

     
    }
}
