public class BankAccount {
    public int numAccount;
    protected String type;
    private float balance;
    private boolean status;
    private String owner;

    public BankAccount() {
        status = false;
        balance = 0.0f;
    }

    public int getNumAccount(){
        return numAccount;
    }

    public void setNumAccount(int na){
        numAccount = na;
    }

    public String getType(){
        return type;
    }

    public void setType(String tp){
        type = tp;
    }

    public float getBalance(){
        return balance;
    }

    public void setBalance(float b){
        balance = b;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean s){
        status = s;
    }


    public String getOwner(){
        return owner;
    }

    public void setOwner(String o){
        owner = o;
    }

    public void openAccount(String type){
        status = true;
        setType(type);
        if (type == "CC" || type == "cc" || type == "Cc" || type == "cC"){
            balance = 50;
            System.out.println("Your 'Conta Corrente' account is now opened!");
        } else if (type == "CP" || type == "cp" || type == "Cp" || type == "cP") {
            balance = 150;
            System.out.println("Your 'Conta Poupança' account is now opened!");
        } else{
            status = false;
            System.out.println("No available bank typed! ");
        }
    }
    public void closeAccount(){
      //  setBalance(balance);
        if (balance == 0f){
            status = false;
            System.out.println("Your account is now closed!");
        }else{
            status = true;
            System.out.println("Error! Your balance must be equal $00.00 to close your account!");
        }

    }

    public void depositValue(float d){
        setBalance(getBalance() + d);
        String newbalance;
        if (status == true){
            System.out.printf("%.1f$ deposited\n", d);
        } else{
             status = false;
             System.out.println("You can't deposit on a closed account!");
        }
    }
    
    public void withdrawValue(float w){
        setBalance(getBalance() - w);
        if (status == true && balance > 0 && balance <= balance){
            System.out.println("How much do you to withdraw?");
        } else if (status == false) {
            System.out.println("You can't withdraw a value on a closed account!");
        }else if (balance < 0 || balance > balance){
            System.out.println("Error! You don't have a available value to withdraw!");
        }else if (balance == 0){
            System.out.println("No money else to withdraw!");
        }

    }

    public void payMonthly(){
        if (type == "CP" && status == true && balance >= 12f){
            balance = balance - 12f;
            System.out.println("$12.00 has been taken from your account for the following reasons:\n" +
                    "Monthly Payment!\n" +
                    "Your new balance is: $"+balance);
        }else if (type == "CC" && status == true && balance >= 20f){
            balance = balance - 20f;
            System.out.println("$20.00 has been taken from your account for the following reasons: \n" +
                    "Monthly Payment!\n" +
                    "Your new balance is: $"+balance);
        }else {
            System.out.println("Error! Your account is closed or don't have the enough value!");

        }
    }



    public void show(){
        System.out.println("Balance: $"+ balance);
        System.out.println("Is the account opened? "+ status);
        System.out.println("Account ID: "+ numAccount);
        System.out.println("Owner: "+ owner);
        System.out.println("Account Type: "+type);
    }


}



