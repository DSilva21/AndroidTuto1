package com.example.appexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        CheckBox whippedCreamCheckBox=(CheckBox)findViewById(R.id.whipped_cream_checkbox);
        CheckBox chocolateCheckBox=(CheckBox)findViewById(R.id.chocolate_checkbox);
        EditText nameField=(EditText) findViewById(R.id.name_field);
        String name= nameField.getText().toString();
        boolean hasWhippedCream=whippedCreamCheckBox.isChecked();
        boolean haschocolate=chocolateCheckBox.isChecked();
        int price=calculatePrice();
        String priceMessage=createOrderSummary(name,price,hasWhippedCream,haschocolate);
        displayMessage(priceMessage);
    }

    public void increment(View view) {
        quantity++;
        display(quantity);
    }

    public void decrement(View view) {
        quantity--;
        display(quantity);
    }

    private void display(int number){
        TextView quantityTextView=(TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+ number);
    }

    private void displayMessage(String message ){
        TextView orderSummaryTextView=(TextView)findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
    private int calculatePrice(){
        return quantity*5;
    }

    private String createOrderSummary(String name, int price,boolean addwhippedCream, boolean addchocolate)
    {
        String priceMessage="Name: "+name;
        priceMessage+="\nAdd whipped cream? "+addwhippedCream;
        priceMessage+="\nAdd chocolate? "+addchocolate;
        priceMessage+="\nQuantity: "+quantity;
        priceMessage+="\nTotal: $"+price;
        priceMessage+="\nThank you";
        return priceMessage;
    }


}