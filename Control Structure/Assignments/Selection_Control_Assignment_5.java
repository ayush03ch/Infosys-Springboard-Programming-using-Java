public class Tester {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter account balance: ");
            double accountBalance = scanner.nextDouble();
            System.out.print("Enter loan type (Car/House/Business): ");
            String loanType = scanner.next();
            System.out.print("Enter expected loan amount: ");
            double expectedLoanAmount = scanner.nextDouble();
            System.out.print("Enter expected number of EMIs: ");
            int expectedEMIs = scanner.nextInt();

            // Validate the account number
            if (String.valueOf(accountNumber).length() != 4 || String.valueOf(accountNumber).charAt(0) != '1') {
                System.out.println("Error: Invalid account number.");
                return;
            }

            // Validate the account balance
            if (accountBalance < 1000) {
                System.out.println("Error: Insufficient account balance.");
                return;
            }

            // Calculate eligible loan amount 
            double eligibleLoanAmount = 0;
            int eligibleEMIs = 0;

            if (loanType.equalsIgnoreCase("Car") && salary > 25000) {
                eligibleLoanAmount = 500000;
                eligibleEMIs = 36;
            } else if (loanType.equalsIgnoreCase("House") && salary > 50000) {
                eligibleLoanAmount = 6000000;
                eligibleEMIs = 60;
            } else if (loanType.equalsIgnoreCase("Business") && salary > 75000) {
                eligibleLoanAmount = 7500000;
                eligibleEMIs = 84;
            }

            // Check if loan can be granted
            if (eligibleLoanAmount == 0 || eligibleEMIs == 0) {
                System.out.println("The bank does not provide loans for the given criteria.");
            } else if (expectedLoanAmount <= eligibleLoanAmount && expectedEMIs <= eligibleEMIs) {
                System.out.println("Eligible Loan Amount: " + eligibleLoanAmount);
                System.out.println("Eligible EMIs: " + eligibleEMIs);
            } else {
                System.out.println("The bank does not provide the requested loan amount or EMIs.");
            }
        }
    }
