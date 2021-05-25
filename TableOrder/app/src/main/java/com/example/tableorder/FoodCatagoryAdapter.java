package com.example.tableorder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FoodCatagoryAdapter extends RecyclerView.Adapter<com.example.tableorder.FoodCatagoryAdapter.ExampleViewHolder> {
        public FoodCatagoryAdapter(ArrayList<FoodCatagoryClass> exampleList){
            mExampleList=exampleList;
        }
        private ArrayList<FoodCatagoryClass> mExampleList;
        @NonNull
        @Override
        public com.example.tableorder.FoodCatagoryAdapter.ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_catagory_resource,parent,false);
            com.example.tableorder.FoodCatagoryAdapter.ExampleViewHolder evh=new com.example.tableorder.FoodCatagoryAdapter.ExampleViewHolder(v);
            return evh;
        }

        @Override
        public void onBindViewHolder(@NonNull com.example.tableorder.FoodCatagoryAdapter.ExampleViewHolder holder, int position) {
            FoodCatagoryClass currentItem=mExampleList.get(position);
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
