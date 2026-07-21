public class InsufficientBalanceException extends Exception {

    double Balance;
    double WithdrawaAmount;

    public InsufficientBalanceException(double balance, double withdrawaAmount) {

        this.Balance = balance;
        this.WithdrawaAmount = withdrawaAmount;
    }

    @Override
    public String getMessage() {

        return "Insufficient Balance\n"
                + "Available Balance : " + Balance
                + "\nWithdrawal Amount : " + WithdrawaAmount;
    }
}