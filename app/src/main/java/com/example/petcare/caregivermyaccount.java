package com.example.petcare;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class caregivermyaccount extends AppCompatActivity {

    private EditText editTextCaregiverName;
    private EditText editTextCaregiverEmail;
    private EditText editTextCaregiverAddress;
    private EditText editTextCaregiverContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caregiver);

        // Initialize UI components
        editTextCaregiverName = findViewById(R.id.editTextCaregiverName);
        editTextCaregiverEmail = findViewById(R.id.editTextCaregiverEmail);
        editTextCaregiverAddress = findViewById(R.id.editTextCaregiverAddress);
        editTextCaregiverContact = findViewById(R.id.editTextCaregiverContact);

        Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle save button click
                saveCaregiverProfile();
            }
        });
    }

    private void saveCaregiverProfile() {
        // Implement the logic to save caregiver's profile details
        // You can retrieve data from the EditText views and perform necessary actions
        String name = editTextCaregiverName.getText().toString();
        String email = editTextCaregiverEmail.getText().toString();
        String address = editTextCaregiverAddress.getText().toString();
        String contactNumber = editTextCaregiverContact.getText().toString();

        // Add your logic to save the data (e.g., send to a server, save in local database, etc.)
        // ...

        // For now, you can print the values to the console
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
}
