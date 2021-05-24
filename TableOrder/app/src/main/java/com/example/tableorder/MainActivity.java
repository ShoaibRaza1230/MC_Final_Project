package com.example.tableorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tableorder.admin.addProduct;
import com.example.tableorder.admin.addTable;
import com.example.tableorder.admin.deleteProducts;
import com.example.tableorder.admin.deleteTables;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_table_view);
        ArrayList<Customer_TablesClass> exampleList=new ArrayList<>();
        exampleList.add(new Customer_TablesClass(R.drawable.table,"1","5","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"2","8","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"1","5","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"2","8","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"1","5","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"2","8","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"1","5","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.table,"2","8","1"));
        exampleList.add(new Customer_TablesClass(R.drawable.ic_launcher_background,"3","6","2"));
        mRecyclerView=findViewById(R.id.recclerView);
        
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new Customer_TableDataAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

}