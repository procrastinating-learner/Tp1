package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recap);
        TextView textrecap = findViewById(R.id.textrecap);

        Intent intent = getIntent();
        String nom = getIntent().getStringExtra("nom");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String adresse = getIntent().getStringExtra("adresse");
        String ville = getIntent().getStringExtra("ville");
        String genre = getIntent().getStringExtra("genre");

        String recaput = "Nom : " + nom + "\nEmail : " + email + "\nPhone : " + phone + "\nAdresse : " + adresse +
                "\nVille : " + ville + "\nGenre : " + genre;
        textrecap.setText(recaput);
    }
}

