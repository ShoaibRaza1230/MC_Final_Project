package com.example.tableorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
    public class Customer_OrderAdapter extends RecyclerView.Adapter<com.example.tableorder.Customer_OrderAdapter.ExampleViewHolder> {
        public Customer_OrderAdapter(ArrayList<Customer_OrderClass> exampleList){
            mExampleList=exampleList;
        }
        private ArrayList<Customer_OrderClass> mExampleList;
        @NonNull
        @Override
        public com.example.tableorder.Customer_OrderAdapter.ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_order_resource,parent,false);
            com.example.tableorder.Customer_OrderAdapter.ExampleViewHolder evh=new com.example.tableorder.Customer_OrderAdapter.ExampleViewHolder(v);
            return evh;
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.tableorder.Customer_OrderAdapter.ExampleViewHolder holder, int position) {
            Customer_OrderClass currentItem=mExampleList.get(position);
            holder.mImageView.setImageResource(currentItem.getmImageResource());
            holder.mTextView1.setText(currentItem.getMtext1());
            holder.mTextView2.setText(currentItem.getMtext2());

        }

        @Override
        public int getItemCount() {
            return mExampleList.size();
        }

        public static class ExampleViewHolder extends RecyclerView.ViewHolder {
            public ImageView mImageView;
            public TextView mTextView1;
            public TextView mTextView2;

            public ExampleViewHolder(@NonNull View itemView) {
                super(itemView);
                mImageView=itemView.findViewById(R.id.Table);
                mTextView1=itemView.findViewById(R.id.TableNo);
                mTextView2=itemView.findViewById(R.id.Capacity);
            }
        }
    }

