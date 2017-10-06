package sample;


public class SecurityCheck {
    /**
     * The pin is checked here, this can be used to control the ownership of the account!
     * @param account getting the given pin for an account
     * @return a boolean
     */
    public boolean checkPin(sample.GenericAccount account) {
        System.out.println("Pleaser Insert your Pin!");
        System.out.println(account.secrectPin);
        return account.secrectPin == account.secrectPin;


    }
}
