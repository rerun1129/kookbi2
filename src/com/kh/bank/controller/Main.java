package com.kh.bank.controller;

import com.kh.bank.view.BankMenu;

public class Main {
    public static void main(String[] args) {
        BankManager b = new BankManager();
        BankMenu m = new BankMenu();

        m.display();
    }
}
