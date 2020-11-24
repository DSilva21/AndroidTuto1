package com.example.appexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        int price=calculatePrice();
        displayMessage(createOrderSummary(price));
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

    private String createOrderSummary(int price)
    {
        String priceMessage="Name: kunal";
        priceMessage+="\nQuantity: "+quantity;
        priceMessage+="\nTotal: $"+price;
        priceMessage+="\nThank you";
        return priceMessage;
    }
}