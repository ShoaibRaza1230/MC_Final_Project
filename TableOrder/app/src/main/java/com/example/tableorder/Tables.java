package com.example.tableorder;

public class Tables {
    private int floorNo;
    private int tableNo;
    private int capacity;
    public Tables(int floorNo, int tableNo, int capacity)
    {
        this.floorNo=floorNo;
        this.tableNo=tableNo;
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "floorNo=" + floorNo +
                ", tableNo=" + tableNo +
                ", capacity=" + capacity +
                '}';
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
