package ATM.model.vo;

public class AtmTotal {
    private String name;
    private String account;
    private int balance;


    public AtmTotal() {
    }

    public AtmTotal(String name, String account, int balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
