import java.util.LinkedList;

public class Ledger {
    private LinkedList<Account> accounts;

    public Ledger(){
        this.accounts = new LinkedList<>();
    }

    public void addAccount(String name, int id){
        this.accounts.add(new Account(name, id));
    }

    public void addTransaction(int id, double amount, boolean isCredit){
        for(int i = 0; i < this.accounts.size(); i++){
            if(this.accounts.get(i).getId() == id){
                this.accounts.get(i).addTransaction(amount, isCredit);
            }
        }
    }

    public int[] getAccountIDs (){
        int[] accountIDs = new int[this.accounts.size()];
        for (int i=0; i < this.accounts.size(); i++){
            accountIDs[i] = this.accounts.get(i).getId();
        }
        return accountIDs;
    }
}
