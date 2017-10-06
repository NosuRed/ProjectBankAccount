package sample;

public class Main /*extends Application*/ {
    /*
    @Override
   /* public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }*/


    public static void main(String[] args) {
        sample.Customer David = new sample.Customer("David","Behrens");
        sample.Customer Philipp = new sample.Customer("Philipp", "Behrens");

        Philipp.setAccount(new sample.CheckingAccount(6666));
        David.setAccount(new sample.SavingAccount(5555));

        sample.SecurityCheck check = new sample.SecurityCheck();
        Philipp.getAccount().modAccountBalance(400.00);
        System.out.println(Philipp.name + " your account balance is " + Philipp.getAccount().getAccountBalance());

        David.getAccount().modAccountBalance(550.00);

        System.out.println(David.name + " your account balance is " + David.getAccount().getAccountBalance());
        sample.Moneytransfer moneytransfer = new sample.Moneytransfer();


        moneytransfer.moneyTransfer(Philipp, David, 50.0);
        System.out.println(Philipp.getAccount().getAccountBalance() + " " + David.getAccount().getAccountBalance());

        System.out.println(Philipp.getAccount().getAccountBalance() + " " + David.getAccount().getAccountBalance());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        moneytransfer.moneyTransfer(David, Philipp, 40.0);

        System.out.println(Philipp.getAccount().getAccountBalance() + " " + David.getAccount().getAccountBalance());

        System.out.println(Philipp.getAccount().getAccountBalance() + " " + David.getAccount().getAccountBalance());

    }


        //launch(args);
}
