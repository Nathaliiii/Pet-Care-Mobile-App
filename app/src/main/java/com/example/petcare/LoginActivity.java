package com.example.petcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.petcare.CaregiverRegistration;
import com.example.petcare.CustomerRegistration;

public class LoginActivity extends AppCompatActivity {

    private RadioGroup radioGroupUserType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Find your buttons and radio group by their IDs
        Button customerRegisterButton = findViewById(R.id.buttonCustomerRegister);
        Button caregiverRegisterButton = findViewById(R.id.buttonCaregiverRegister);
        radioGroupUserType = findViewById(R.id.radioGroupUserType);

        // Set click listener for Customer Register button
        customerRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch CustomerRegisterActivity
                Intent intent = new Intent(LoginActivity.this, CustomerRegistration.class);
                startActivity(intent);
            }
        });

        // Set click listener for Caregiver Register button
        caregiverRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch CaregiverRegisterActivity
                Intent intent = new Intent(LoginActivity.this, CaregiverRegistration.class);
                startActivity(intent);
            }
        });

        // Set click listener for the login button
        Button loginButton = findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected radio button from the radio group
                int selectedId = radioGroupUserType.getCheckedRadioButtonId();

                if (selectedId != -1) {
                    RadioButton radioButton = findViewById(selectedId);
                    String userType = radioButton.getText().toString();

                    // Show a message based on the selected user type
                    String message;
                    if ("Customer".equals(userType)) {
                        message = "Customer logged in successfully";
                    } else if ("Caregiver".equals(userType)) {
                        message = "Caregiver logged in successfully";
                    } else {
                        message = "Unknown user type";
                    }

                    Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
                } else {
                    // Show an error message if no radio button is selected
                    Toast.makeText(LoginActivity.this, "Please select a user type", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
