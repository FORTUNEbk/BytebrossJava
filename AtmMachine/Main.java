public class Main {
    public static void main(String[] args) {
        Account account = new Account("123456", "John Doe", 500.00);
        ATM atm = new ATM(account);
        atm.start();
    }
}
