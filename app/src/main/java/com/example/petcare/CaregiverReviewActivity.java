package com.example.petcare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CaregiverReviewActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private EditText etReview;
    private Button btnSubmitReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caregiver_review);

        ratingBar = findViewById(R.id.ratingBar);
        etReview = findViewById(R.id.etReview);
        btnSubmitReview = findViewById(R.id.btnSubmitReview);

        btnSubmitReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the rating and review text
                float rating = ratingBar.getRating();
                String reviewText = etReview.getText().toString();

                // Perform actions with the rating and review text (e.g., send to server, store locally)

                // Display a toast message
                Toast.makeText(CaregiverReviewActivity.this, "Review submitted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
