package com.example.tableorder.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tableorder.Orders;
import com.example.tableorder.Products;
import com.example.tableorder.R;
import com.example.tableorder.Tables;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Customer_OrderAdapter extends RecyclerView.Adapter<Customer_OrderAdapter.ExampleViewHolder> {
        private List<Products> productsList;
        Context context;
        public Customer_OrderAdapter(List<Products> exampleList, Context context){
            productsList=exampleList;
            this.context=context;
        }
        @NonNull
        @Override
        public Customer_OrderAdapter.ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_order_resource,parent,false);
            Customer_OrderAdapter.ExampleViewHolder evh=new Customer_OrderAdapter.ExampleViewHolder(v);
            return evh;

        }

        @Override
        public void onBindViewHolder(@NonNull Customer_OrderAdapter.ExampleViewHolder holder, int position) {
            Products currentProduct=productsList.get(position);

          //  holder.imageeView.setImageResource(currentTable.getImage());
            holder.name.setText(String.valueOf(currentProduct.getName()));
            holder.price.setText(String.valueOf(currentProduct.getPrice()));
            holder.discount.setText(String.valueOf(currentProduct.getDiscount()));

        }

        @Override
        public int getItemCount() {
            return productsList.size();
        }

        public static class ExampleViewHolder extends RecyclerView.ViewHolder {
            public ImageView imageeView;
            public TextView name;
            public TextView price;
            public TextView discount;

            public ExampleViewHolder(@NonNull View itemView) {
                super(itemView);
                name=itemView.findViewById(R.id.productName);
                price=itemView.findViewById(R.id.price);
                discount=itemView.findViewById(R.id.discount);
              //  floorView=itemView.findViewById(R.id.FloorNo);
            }
        }
    }

