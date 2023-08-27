import java.util.*;

class Bank {

    // Set All The Attribute
    private String accno;
    private String name;
    private String acc_type;
    private long balance;

    // Create a Object for User input
    Scanner sc = new Scanner(System.in);

    // 1. Method To Open a New Account
    public Void openAccount() {
        System.out.println("Enter Account No: ");
        accno = sc.next();

        System.out.println("Enter Name: ");
        name = sc.next();

        System.out.println("Enter Account Type: ");
        acc_type = sc.next();

        System.out.println("Enter Balence: ");
        balance = sc.nextLong();
    }

    // 2. Method To Display The account Details.

    public void showAccount() {
        System.out.println("Name of account Holder -> " + name);
        System.out.println("Name of account NO -> " + accno);
        System.out.println("Name of Account Type -> " + acc_type);
        System.out.println("Balence -> " + balance);
    }

    // 3. Diposite Ammount
    public void Diposit() {
        long amt;
        System.out.println("Enter The Amount You want to Diposite: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    // 4. Withdraw The Amount
    public void withDraw(){
        long amt;
        System.out.println("Enter The Amount You want To withDraw: ");
        amt = sc.nextLong();

        if(balance >= amt){
            balance = balance - amt;
            System.out.println("Balence After withdraw " + balance);
        }else{
            System.out.println("Your Account Balence is less " + amt + " Transition Failed!");
        }
    }

    public static void main(String[] args) {

    }
}