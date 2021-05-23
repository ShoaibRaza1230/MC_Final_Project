package com.example.tableorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tableorder.admin.addProduct;
import com.example.tableorder.admin.addTable;
import com.example.tableorder.admin.deleteProducts;
import com.example.tableorder.admin.deleteTables;

public class MainActivity extends AppCompatActivity {

    Button add,addTable,dTable,dProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add);
        addTable=findViewById(R.id.addTable);
        dTable=findViewById(R.id.deleteTablesBTn);
        dProduct=findViewById(R.id.deleteProductBtn);
        dProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, deleteProducts.class);
                startActivity(intent);
            }
        });
        dTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, deleteTables.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, addProduct.class);
                startActivity(intent);
            }
        });
        addTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, addTable.class);
                startActivity(intent);
            }
        });
    }
    
}