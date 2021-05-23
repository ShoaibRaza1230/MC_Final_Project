package com.example.tableorder.ProductDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.tableorder.Products;
import com.example.tableorder.Tables;
import com.example.tableorder.admin.addTable;

import androidx.annotation.Nullable;

public class TableDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "tableDB";
    private static final String TABLE_NAME="tables";

    public static final String TABLE_ID = "ID";
    public static final String FLOOR_NO= "floorNo";
    public static final String TABLE_NO = "tableNo";
    public static final String TABLE_CAPACITY="tableCapacity";

    public TableDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable= "CREATE TABLE " + TABLE_NAME+ "("+ TABLE_ID + " Integer PRIMARY KEY AUTOINCREMENT, "+
                FLOOR_NO + " Interger, "+ TABLE_NO + " Interger, "+ TABLE_CAPACITY + " Integer)";
        db.execSQL(createTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addTable(Tables tables){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(FLOOR_NO, tables.getFloorNo());
        cv.put(TABLE_NO, tables.getTableNo());
        cv.put(TABLE_CAPACITY, tables.getCapacity());
        long insert = db.insert(TABLE_NAME, null, cv);
        if (insert == -1) { return false; }
        else{return true;}
    }

    public boolean deleteTable(Tables tables){
        SQLiteDatabase db = getWritableDatabase();
        String whereClause = "floorNo=? and tableNo=?";
        String whereArgs[] = {String.valueOf(tables.getFloorNo()), String.valueOf(tables.getTableNo())};
        long delete =db.delete(TABLE_NAME, whereClause, whereArgs);
        if (delete <= 0) { return false; }
        else{return true;}
    }
    public boolean updateTable(Tables tables){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(FLOOR_NO, tables.getFloorNo());
        cv.put(TABLE_NO, tables.getTableNo());
        cv.put(TABLE_CAPACITY, tables.getCapacity());
        long insert = db.insert(TABLE_NAME, null, cv);
        if (insert == -1) { return false; }
        else{return true;}
    }
}
