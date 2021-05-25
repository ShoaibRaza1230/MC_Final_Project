package com.example.tableorder.AdminDB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class OrderDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "adminDB";

    private static final String TABLE_NAME="OrderTable";
    public static final String FLOOR_NO= "floorNo";
    public static final String TABLE_NO = "tableNo";
    public static final String ORDER_ID = "ID";
    public static final String ODER_NAME = "Name";
    public static final String ORDER_PRICE = "Price";
    public static final String PRODUCT_TYPE = "Type";
    public static final String PRODUCT_STATUS = "Status";

    public OrderDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createOrderTable= "CREATE TABLE " + TABLE_NAME+ "("+ ORDER_ID + " Integer PRIMARY KEY AUTOINCREMENT, "+
                ODER_NAME + " Text, "+ ORDER_PRICE + " Interger, "+ TABLE_NO + " Interger, "+ FLOOR_NO + " Integer, "+ PRODUCT_TYPE +" Text, "
                + PRODUCT_STATUS +" BOOL)";
        db.execSQL(createOrderTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
