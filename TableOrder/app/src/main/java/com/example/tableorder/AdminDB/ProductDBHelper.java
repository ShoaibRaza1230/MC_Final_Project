package com.example.tableorder.AdminDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tableorder.Products;

import androidx.annotation.Nullable;

public class ProductDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "prodcutDB";
    private static final String TABLE_NAME="product";

    public static final String PRODUCT_ID = "ID";
    public static final String PRODUCT_NAME = "Name";
    public static final String PRODUCT_PRICE = "Price";

    public static final String PRODUCT_ACTUAL_PRICE="ActualPrice";
    public static final String PRODUCT_DISCOUNT = "Discount";
    public static final String PRODUCT_TYPE = "Type";
    public static final String PRODUCT_STATUS = "Status";

    public ProductDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createProductTable= "CREATE TABLE " + TABLE_NAME+ "("+ PRODUCT_ID + " Integer PRIMARY KEY AUTOINCREMENT, "+
                PRODUCT_NAME + " Text, "+ PRODUCT_PRICE + " Interger, "+ PRODUCT_ACTUAL_PRICE + " Interger, "+ PRODUCT_DISCOUNT + " Integer, "+ PRODUCT_TYPE +" Text, "
                + PRODUCT_STATUS +" BOOL)";
        db.execSQL(createProductTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
    public boolean addProduct(Products products){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(PRODUCT_NAME, products.getName());
        cv.put(PRODUCT_PRICE, products.getPrice());
        cv.put(PRODUCT_ACTUAL_PRICE, products.getActualPrice());
        cv.put(PRODUCT_DISCOUNT, products.getDiscount());
        cv.put(PRODUCT_TYPE, products.getType());
        cv.put(PRODUCT_STATUS, products.isStatus());
        long insert = db.insert(TABLE_NAME, null, cv);
        if (insert == -1) { return false; }
        else{return true;}
    }

    public boolean deleteProduct(Products products){
        SQLiteDatabase db = getWritableDatabase();
        String whereClause = "Name=? and Type=?";
        String whereArgs[] = {products.getName(), products.getType()};
        long delete =db.delete(TABLE_NAME, whereClause, whereArgs);
        if (delete <= 0) { return false; }
        else{return true;}
    }
}
