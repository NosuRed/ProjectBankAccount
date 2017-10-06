package sample;

public abstract class GenericAccount {
    protected int secrectPin;
    protected Double AccountBalance = 0.0;
    protected Double minAccountBalance = 0.0;
    protected Double interest;
    protected Boolean canTransferMoney;


    /**
     * Adds or takes money from the Bank account, interest is calculated here as well because I am lazy
     * @param amount amount added or taken from the account
     * @return returns a boolean
     */
    public boolean  modAccountBalance(Double amount) {
        Double newAccountBalance = AccountBalance + amount;
        Double newInterest = newAccountBalance * (interest / 100);
        if (newAccountBalance >= minAccountBalance) {
            AccountBalance = newAccountBalance + newInterest;
            return true;
        } else { return false; }
    }


    public void setSecrectPin(int secrectPin) {
        this.secrectPin = secrectPin;
    }



    public Double getAccountBalance() {
        return AccountBalance;
    }
}
