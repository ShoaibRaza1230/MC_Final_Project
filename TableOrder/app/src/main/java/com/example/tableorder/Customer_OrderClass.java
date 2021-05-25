package com.example.tableorder;
public class Customer_OrderClass {
    private int mImageResource;
    private String mtext1;
    private String mtext2;
    public Customer_OrderClass(int imageResource, String text1, String text2){
        mImageResource=imageResource;
        mtext1=text1;
        mtext2=text2;
    }
    public int getmImageResource(){
        return mImageResource;
    }
    public String getMtext1(){
        return mtext1;
    }
    public String getMtext2(){
        return mtext2;
    }
}
