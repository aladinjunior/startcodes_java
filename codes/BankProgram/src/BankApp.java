public class BankApp {
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount();
        ba.setNumAccount(2987634);
        ba.setOwner("Jubileu");
        ba.openAccount("CP");
        ba.depositValue(250f);
        ba.withdrawValue(400f);
        ba.closeAccount();
        ba.show();

    }

}