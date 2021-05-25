package com.example.tableorder.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tableorder.MainActivity;
import com.example.tableorder.R;

public class AdminPanel extends AppCompatActivity {

    Button add,addTable,dTable,dProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);
        add=findViewById(R.id.add);
        addTable=findViewById(R.id.addTable);
        dTable=findViewById(R.id.deleteTablesBTn);
        dProduct=findViewById(R.id.deleteProductBtn);
        dProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminPanel.this, deleteProducts.class);
                startActivity(intent);
            }
        });
        dTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminPanel.this, deleteTables.class);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminPanel.this, addProduct.class);
                startActivity(intent);
            }
        });
        addTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminPanel.this, addTable.class);
                startActivity(intent);
            }
        });
    }
}