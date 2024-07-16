package com.example.petcare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PetInfoActivity extends AppCompatActivity {

    private EditText etPetName, etPetAge, etPetBreed, etPetSex, etBodyColor, etEyesColor;
    private Button btnFindCaregiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_info);

        etPetName = findViewById(R.id.etPetName);
        etPetAge = findViewById(R.id.etPetAge);
        etPetBreed = findViewById(R.id.etPetBreed);
        etPetSex = findViewById(R.id.etPetSex);
        etBodyColor = findViewById(R.id.etBodyColor);
        etEyesColor = findViewById(R.id.etEyesColor);

        btnFindCaregiver = findViewById(R.id.btnEnter);
        btnFindCaregiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve pet information
                String petName = etPetName.getText().toString();
                String petAge = etPetAge.getText().toString();
                String petBreed = etPetBreed.getText().toString();
                String petSex = etPetSex.getText().toString();
                String bodyColor = etBodyColor.getText().toString();
                String eyesColor = etEyesColor.getText().toString();

                // Pass the pet details to the next activity (PetDetailsActivity)
                Intent intent = new Intent(PetInfoActivity.this, PetDetailsActivity.class);
                intent.putExtra("PET_NAME", petName);
                intent.putExtra("PET_AGE", petAge);
                intent.putExtra("PET_BREED", petBreed);
                intent.putExtra("PET_SEX", petSex);
                intent.putExtra("BODY_COLOR", bodyColor);
                intent.putExtra("EYES_COLOR", eyesColor);

                // Start the next activity
                startActivity(intent);
            }
        });
    }
}
