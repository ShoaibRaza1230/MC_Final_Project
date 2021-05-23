package com.example.tableorder;

    public class Customer_TablesClass {
        private int mImageResource;
        private String mtext1;
        private String mtext2;
        private String mtext3;
        public Customer_TablesClass(int imageResource, String text1, String text2, String text3){
            mImageResource=imageResource;
            mtext1=text1;
            mtext2=text2;
            mtext3=text3;
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
        public String getMtext3(){
            return mtext3;
        }
    }
