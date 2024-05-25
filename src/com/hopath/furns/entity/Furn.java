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
    private String price;
    private String sales;
    private String stock;

    public Furn(){

    }
    public Furn(int id, String name, String maker, String price, String sales, String stock) {
        this.id = id;
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.sales = sales;
        this.stock = stock;
    }

    public Furn(String name, String maker, String price, String sales, String stock) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
