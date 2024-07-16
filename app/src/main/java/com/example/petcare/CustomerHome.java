package com.example.petcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CustomerHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_home);

        TextView tvCustomerHomePage = findViewById(R.id.tvCustomerHomePage);
        Button btnCreatePost = findViewById(R.id.btnCreatePost);
        Button btnMyAccount = findViewById(R.id.btnMyAccount);
        Button btnWriteReview = findViewById(R.id.btnWriteReview);
        Button btnSignOut = findViewById(R.id.btnSignOut);

        tvCustomerHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Customer Home Page clicked");
                // Add any additional logic you want to perform when the TextView is clicked
            }
        });

        btnCreatePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to PetLoginInfoActivity
                Intent intent = new Intent(CustomerHome.this, PetInfoActivity.class);
                startActivity(intent);
            }
        });

        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to MyAccountActivity
                Intent intent = new Intent(CustomerHome.this, MyAccountCustomer.class);
                startActivity(intent);
            }
        });

        btnWriteReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to CustomerReviewActivity
                Intent intent = new Intent(CustomerHome.this, CustomerReviewActivity.class);
                startActivity(intent);
            }
        });

        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showToast("Signing out...");

            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
