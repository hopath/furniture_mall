package com.hopath.furns.entity;

import sun.applet.AppletResourceLoader;

/**
 * @author 张志伟
 * @version 1.0
 */
public class Furn {
    private int id;
    private String name;
    private String maker;
    private double price;
    private int sales;
    private int stock;

    public Furn(){

    }
    public Furn(int id, String name, String maker, double price, int sales, int stock) {
        this.id = id;
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
    }

    public Furn(String name, String maker, double price, int sales, int stock) {
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
