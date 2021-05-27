package com.example.tableorder.Customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.tableorder.Adapter.Customer_OrderAdapter;
import com.example.tableorder.Adapter.Customer_TableDataAdapter;
import com.example.tableorder.AdminDB.ProductDBHelper;
import com.example.tableorder.AdminDB.TableDBHelper;
import com.example.tableorder.FoodCatagory;
import com.example.tableorder.Products;
import com.example.tableorder.R;
import com.example.tableorder.Tables;

import java.util.ArrayList;
import java.util.List;

public class customer_order extends AppCompatActivity {
    private RecyclerView custRecycleView;
    private RecyclerView.Adapter custAdapter;
    private RecyclerView.LayoutManager custLayoutManager;
    ProductDBHelper productDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order);
        Intent intent=getIntent();
        String fodCatagory= intent.getStringExtra("foodCatagory");
        custRecycleView=findViewById(R.id.recclerView);

        custRecycleView.setHasFixedSize(true);
        custLayoutManager=new LinearLayoutManager(this);

        custRecycleView.setLayoutManager(custLayoutManager);

        productDB = new ProductDBHelper(this);
        List<Products> allProducts = productDB.getAllProduct(fodCatagory);
        if (allProducts.size() > 0) {
            custRecycleView.setVisibility(View.VISIBLE);
            // ContactAdapter mAdapter = new ContactAdapter(this, allContacts);
            custAdapter=new Customer_OrderAdapter(allProducts,getApplicationContext());
            custRecycleView.setAdapter(custAdapter);
        }
        else {
            custRecycleView.setVisibility(View.GONE);
            Toast.makeText(this, "There is no Table in the database. Start adding now", Toast.LENGTH_LONG).show();
        }
    }

    public void FoodCatagories(View view) {
        Intent intent=new Intent(customer_order.this, FoodCatagory.class);
        startActivity(intent);
    }


}