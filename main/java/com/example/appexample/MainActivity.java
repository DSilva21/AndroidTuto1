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
        int price=quantity*5;
        String priceMessage="Total: $"+price;
        priceMessage=priceMessage+"\nThank you";
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
/*
    private void displayPrice(int number){
        TextView priceTextView=(TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Total: "+NumberFormat.getCurrencyInstance().format(number));
    }
*/
    private void displayMessage(String message ){
        TextView priceTextView=(TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}