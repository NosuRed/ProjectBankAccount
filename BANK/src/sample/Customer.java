package sample;

public class Customer {
   public String name, lastName;
    private sample.GenericAccount account;

    public sample.GenericAccount getAccount() {
        return account;
    }



    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public void setAccount(sample.GenericAccount account) {
        this.account = account;
    }
}
