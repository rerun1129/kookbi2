package com.kh.prod;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(){

    }
    public Product(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String information(){
        System.out.println("상품명 : " + name);
        System.out.println("가격 : " + price + " 원");
        System.out.println("수량 : " + quantity + "개 ");

     return "";
    }


    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
