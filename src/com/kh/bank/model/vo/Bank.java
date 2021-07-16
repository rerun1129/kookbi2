package com.kh.bank.model.vo;

public class Bank {
    private String pw;
    private String account;
    private long balance;
    private String name;

    public Bank() {
    }

    public Bank(String pw, String account, long balance, String name) {
        super();
        this.pw = pw;
        this.account = account;
        this.balance = balance;
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
