package sample;

public class Moneytransfer{

    /**
     * Checking accounts can transfer money, saving accounts can't
     * The method takes an amount off the Checking ticket and gives the same amount to the saving account
      * @param customer1 is the account that wants to transfer money
     * @param customer2 is the account that receives the money
     * @param amount the amount that will be transfert
     * @return a boolean
     */
    public Boolean moneyTransfer(sample.Customer customer1, sample.Customer customer2, Double amount){
        if (customer1.getAccount().canTransferMoney){
        customer1.getAccount().modAccountBalance( - amount);
        customer2.getAccount().modAccountBalance(amount);
        return true;}else{return false;}
    }
}
