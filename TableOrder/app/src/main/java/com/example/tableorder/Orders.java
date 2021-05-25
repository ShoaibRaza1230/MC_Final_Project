package com.example.tableorder;

public class Orders {
    private String name;
    private int price;
    private String Type;
    private int table;
    private int floor;
    private boolean status;
    public Orders(String name, int price, String type, int table, int floor, boolean status) {
        this.name = name;
        this.price = price;
        Type = type;
        this.table = table;
        this.floor = floor;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
