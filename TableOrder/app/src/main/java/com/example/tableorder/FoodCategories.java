package com.example.tableorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodCategories extends AppCompatActivity {

    ImageView img;
    TextView floor,table,cap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_catagories);
        img=findViewById(R.id.imageView);
        floor=findViewById(R.id.textView12);
        table=findViewById(R.id.textView14);
        cap=findViewById(R.id.textView15);

        img.setImageResource(getIntent().getIntExtra("imageNames",0));
        int f=getIntent().getIntExtra("floors",0);
        int t=getIntent().getIntExtra("tables",0);
        int c=getIntent().getIntExtra("capacities",0);

        floor.setText(String.valueOf(f));
        table.setText(String.valueOf(t));
        cap.setText(String.valueOf(c));

    }
}