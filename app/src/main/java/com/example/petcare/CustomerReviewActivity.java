package com.example.petcare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CustomerReviewActivity extends AppCompatActivity {

    private RatingBar ratingBar;
    private EditText etReview;
    private Button btnSubmitReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer_review);

        ratingBar = findViewById(R.id.ratingBar);
        etReview = findViewById(R.id.etReview);
        btnSubmitReview = findViewById(R.id.btnSubmitReview);

        btnSubmitReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                String review = etReview.getText().toString();
                // You can perform actions with the rating and review here

                // Display a toast message (you can replace this with your own logic)
                Toast.makeText(CustomerReviewActivity.this, "Rating: " + rating + "\nReview: " + review, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

