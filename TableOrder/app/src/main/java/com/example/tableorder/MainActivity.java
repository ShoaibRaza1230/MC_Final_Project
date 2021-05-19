package com.example.tableorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tableorder.admin.addProduct;

public class MainActivity extends AppCompatActivity {

    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, addProduct.class);
                startActivity(intent);
            }
        });
    }

    public void orderTable1(View view) {
        Intent intent = new Intent(MainActivity.this, Table1.class);
        startActivity(intent);
    }
    public void orderTable2(View view) {
        Intent intent = new Intent(MainActivity.this, Table2.class);
        startActivity(intent);
    }
    public void orderTable3(View view) {
        Intent intent = new Intent(MainActivity.this, Table3.class);
        startActivity(intent);
    }
    public void orderTable4(View view) {
        Intent intent = new Intent(MainActivity.this, Table4.class);
        startActivity(intent);
    }
    public void orderTable5(View view) {
        Intent intent = new Intent(MainActivity.this, Table5.class);
        startActivity(intent);
    }
    public void orderTable6(View view) {
        Intent intent = new Intent(MainActivity.this, Table6.class);
        startActivity(intent);
    }
}