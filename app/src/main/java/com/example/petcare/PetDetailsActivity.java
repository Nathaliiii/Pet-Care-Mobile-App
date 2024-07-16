package com.example.petcare;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PetDetailsActivity extends AppCompatActivity {

    private TextView tvPetName, tvPetAge, tvPetBreed, tvPetSex, tvBodyColor, tvEyesColor;
    private Button btnEdit, btnDelete, btnBookNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_details);

        // Retrieve data from PetInfoActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String petName = extras.getString("PET_NAME");
            String petAge = extras.getString("PET_AGE");
            String petBreed = extras.getString("PET_BREED");
            String petSex = extras.getString("PET_SEX");
            String bodyColor = extras.getString("BODY_COLOR");
            String eyesColor = extras.getString("EYES_COLOR");

            // Initialize TextViews
            tvPetName = findViewById(R.id.tvPetName);
            tvPetAge = findViewById(R.id.tvPetAge);
            tvPetBreed = findViewById(R.id.tvPetBreed);
            tvPetSex = findViewById(R.id.tvPetSex);
            tvBodyColor = findViewById(R.id.tvBodyColor);
            tvEyesColor = findViewById(R.id.tvEyesColor);

            // Set TextViews with retrieved data
            tvPetName.setText("Pet Name: " + petName);
            tvPetAge.setText("Pet Age: " + petAge);
            tvPetBreed.setText("Pet Breed: " + petBreed);
            tvPetSex.setText("Pet Sex: " + petSex);
            tvBodyColor.setText("Body Color: " + bodyColor);
            tvEyesColor.setText("Eyes Color: " + eyesColor);

            // Initialize buttons
            btnEdit = findViewById(R.id.btnEdit);
            btnDelete = findViewById(R.id.btnDelete);
            btnBookNow = findViewById(R.id.btnBookNow);

            // Set click listeners for Edit, Delete, and Book Now buttons
            btnEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Implement edit logic
                    // You can launch an EditPetActivity or show a dialog for editing
                }
            });

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Implement delete logic
                    // You can show a confirmation dialog and delete the pet data
                }
            });

            btnBookNow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Implement book now logic
                    // You can launch a BookNowActivity or perform booking operations
                }
            });
        }
    }
}
