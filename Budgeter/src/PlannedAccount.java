public class PlannedAccount {
    private double alloted;
    private int accountID;

    public PlannedAccount(double alloted, int accountID){
        this.alloted = alloted;
        this.accountID = accountID;
    }

    public double getAlloted() {
        return alloted;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAlloted(double alloted) {
        this.alloted = alloted;
    }
}
