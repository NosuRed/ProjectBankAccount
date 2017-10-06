package sample;

public class CheckingAccount extends sample.GenericAccount {
    private static final Double CREDITLIMIT = -200.00;
    /**
     * The Pin is set here
     * the CheckingAccount can borrow money from the bank
     * the checking account can transfer money!
     * @param secretPin
     */
    public CheckingAccount(int secretPin){
        this.secrectPin = secretPin;
        this.minAccountBalance = CREDITLIMIT;
        this.canTransferMoney = true;
        this.interest = 0.0;

    }


}
