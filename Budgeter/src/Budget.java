import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Budget {
    private String month;
    private int year;
    private Map<Integer, Double> plannedSpending;

    public Budget(String month, int year, int[] accountIDs, Ledger ledger){
        this.plannedSpending = new Hashtable<>();
        for(int i=0; i < accountIDs.length; i++){
            this.plannedSpending.put(accountIDs[i], 0.0);
        }
        this.month = month;
        this.year = year;
    }

    public boolean setSpending(int accountID, double allotedAmount){
        Object j =this.plannedSpending.computeIfPresent(accountID, (k,v) -> allotedAmount);
        if (j != null){
            return false;
        } else {
            return true;
        }
    }
}
