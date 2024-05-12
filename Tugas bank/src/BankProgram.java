import java.util.Scanner;

public class BankProgram {
    public BankProgram() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("12345", 5000.0);
        boolean exit = false;

        while(!exit) {
            System.out.println("\nBank UMM Menu:");
            System.out.println("1. Deposit Saldo");
            System.out.println("2. Tarik Saldo");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah deposit: Rp");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang akan ditarik: Rp");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Saldo anda: Rp" + account.getBalance());
                    break;
                case 4:
                    exit = true;
                    System.out.println("Berhasil Logout");
                    break;
                default:
                    System.out.println("Invalid.");
            }
        }

        scanner.close();
    }
}