// MyAccountActivity.java
package com.example.petcare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MyAccountCustomer extends AppCompatActivity {

    private EditText etName, etEmail, etContactNumber, etAddress;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myaccount_customer);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etContactNumber = findViewById(R.id.etContactNumber);
        etAddress = findViewById(R.id.etAddress);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveAccountDetails();
            }
        });
    }

    private void saveAccountDetails() {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String contactNumber = etContactNumber.getText().toString();
        String address = etAddress.getText().toString();

        // You can perform additional logic like validating the data or saving it to a database

        // Display a toast message
        String toastMessage = "Account details saved:\nName: " + name +
                "\nEmail: " + email +
                "\nContact Number: " + contactNumber +
                "\nAddress: " + address;
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show();
    }
}
