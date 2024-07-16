package com.example.petcare;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.petcare.CaregiverReviewActivity;
import com.example.petcare.LoginActivity;
import com.example.petcare.PetDetailsActivity;

public class CaregiverHome extends AppCompatActivity {

    private Button myAccountButton, checkVacanciesButton, addReviewButton, signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caregiver_home);

        initializeViews();

        // Set click listener for the My Account button
        myAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleMyAccount();
            }
        });

        // Set click listener for the Check Vacancies button
        checkVacanciesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleCheckVacancies();
            }
        });

        // Set click listener for the Add Review button
        addReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleAddReview();
            }
        });

        // Set click listener for the Sign Out button
        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleSignOut();
            }
        });
    }

    private void initializeViews() {
        // Initialize buttons
        myAccountButton = findViewById(R.id.btnMyAccountCaregiver);
        checkVacanciesButton = findViewById(R.id.btnCheckVacancies);
        addReviewButton = findViewById(R.id.btnAddReviewCaregiver);
        signOutButton = findViewById(R.id.btnSignOut);
    }

    private void handleMyAccount() {
        // Navigate to caregivermyaccount
        startActivity(new Intent(CaregiverHome.this, caregivermyaccount.class));
    }

    private void handleCheckVacancies() {
        // Navigate to PetDetailsActivity
        startActivity(new Intent(CaregiverHome.this, PetDetailsActivity.class));
    }

    private void handleAddReview() {
        // Navigate to CaregiverReviewActivity
        startActivity(new Intent(CaregiverHome.this, CaregiverReviewActivity.class));
    }

    private void handleSignOut() {
        // Navigate to LoginActivity and show a logout message
        Intent intent = new Intent(CaregiverHome.this, LoginActivity.class);
        intent.putExtra("logout_message", "You have successfully logged out.");
        startActivity(intent);
        finish(); // Finish the current activity to prevent going back
    }
}
