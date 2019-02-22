import java.time.LocalDate;

public class Transaction {

    private LocalDate timeStamp;
    private double amount;
    private boolean isCredit;

    public Transaction (double amount, boolean isCredit) {
        this.timeStamp = LocalDate.now();
        this.amount = amount;
        this.isCredit = isCredit;
    }

    public boolean isCredit() {
        return isCredit;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public double getAmount() {
        return amount;
    }
}
