package com.example.tableorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class Customer_TableDataAdapter extends RecyclerView.Adapter<Customer_TableDataAdapter.ExampleViewHolder> {
    public Customer_TableDataAdapter(ArrayList<Customer_TablesClass> exampleList){
        mExampleList=exampleList;
    }
    private ArrayList<Customer_TablesClass> mExampleList;
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.customer_table_resource,parent,false);
        ExampleViewHolder evh=new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        Customer_TablesClass currentItem=mExampleList.get(position);
        holder.mImageView.setImageResource(currentItem.getmImageResource());
        holder.mTextView1.setText(currentItem.getMtext1());
        holder.mTextView2.setText(currentItem.getMtext2());
        holder.mTextView3.setText(currentItem.getMtext3());

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.Table);
            mTextView1=itemView.findViewById(R.id.TableNo);
            mTextView2=itemView.findViewById(R.id.Capacity);
            mTextView3=itemView.findViewById(R.id.FloorNo);
        }
    }
}
