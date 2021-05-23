package com.example.tableorder.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.tableorder.ProductDB.ProductDBHelper;
import com.example.tableorder.ProductDB.TableDBHelper;
import com.example.tableorder.Products;
import com.example.tableorder.R;
import com.example.tableorder.Tables;

public class deleteProducts extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] foods = { "Vigitable", "Fast Food", "Chiken", "Drink", "Other"};
    EditText name;
    Button deleteBtn,cancelBtn;
    String type="";
    Products productsDeleteObj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_products);
        name= findViewById(R.id.dProductName);

        deleteBtn=findViewById(R.id.deleteBtn);
        cancelBtn=findViewById(R.id.dCancelBtn);

        Spinner spin = (Spinner) findViewById(R.id.dProductType);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,foods);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    public void deleteProduct(View view) {

        try {

            productsDeleteObj = new Products(name.getText().toString(), 0,0, type , 0, false);
            Toast.makeText(deleteProducts.this, productsDeleteObj.toString(), Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(deleteProducts.this, "Error", Toast.LENGTH_LONG).show();
        }
        ProductDBHelper dProductdbHelper = new ProductDBHelper(deleteProducts.this);
        boolean b = dProductdbHelper.deleteProduct(productsDeleteObj);
        if(b==true)
        {
            Toast.makeText(deleteProducts.this, "Successfully Delete", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(deleteProducts.this, "Failed to Delete", Toast.LENGTH_SHORT).show();
        }
    }

    public void cancelDeleteProduct(View view) {
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),foods[position] , Toast.LENGTH_LONG).show();
        type=foods[position];

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}