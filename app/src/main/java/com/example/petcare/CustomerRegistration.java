package com.example.petcare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class CustomerRegistration extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextContactNumber, editTextAddress, editTextPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_registration);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextContactNumber = findViewById(R.id.editTextContactNumber);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextPassword = findViewById(R.id.editTextPassword);

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve customer information and perform registration logic
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                String contactNumber = editTextContactNumber.getText().toString();
                String address = editTextAddress.getText().toString();
                String password = editTextPassword.getText().toString();

                // Perform customer registration logic here (you can replace this with your own logic)

                // Display a toast message
                Toast.makeText(CustomerRegistration.this, "Registration successful " + name, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CustomerRegistration.this, CustomerHome.class);
                startActivity(intent);
            }
        });
    }
}
