package sample;

public class SavingAccount extends sample.GenericAccount {

    /**
     * every account has a pin, so when an account is created they are given one
     * The min account balance is set here
     * the interest is set here
     * boolean for the money transfer is here as well, saving accounts can't transfer money!
     * @param secretPin is just an integer that can be any number
     */

    public SavingAccount(int secretPin){
        this.setSecrectPin(secretPin);
        this.minAccountBalance = 0.00;
        this.canTransferMoney = false;
        this.interst = 2.0;
    }


}
