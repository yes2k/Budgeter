import java.util.LinkedList;

public class Account {
    private LinkedList<Transaction> transactions;
    private String name;
    private int id;

    public Account(String name, int id){
        this.transactions = new LinkedList<>();
        this.name = name;
        this.id=id;
    }

    public Account(LinkedList<Transaction> transactions, String name, int id){
        this.transactions = transactions;
        this.name = name;
        this.id=id;
    }

    public void addTransaction(double amount, boolean isCredit){
        this.transactions.add(new Transaction (amount, isCredit));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
