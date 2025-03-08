package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private Spinner villeSpinner;
    private EditText nomPrenomEditTxt, emailEditTxt, phoneEditTxt, adresseEditTxt;
    private RadioGroup radiogenre;

    private Button btnEnvoyer;
    private ArrayList<String> villes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        villeSpinner = findViewById(R.id.villespinner);
        nomPrenomEditTxt = findViewById(R.id.nomPrenomEditTxt);
        emailEditTxt = findViewById(R.id.emailEditTxt);
        phoneEditTxt = findViewById(R.id.phoneEditTxt);
        adresseEditTxt = findViewById(R.id.adresseEditTxt);
        radiogenre = findViewById(R.id.radioGroupGenre);
        btnEnvoyer = findViewById(R.id.btnEnvoyer);

        villes = new ArrayList<>();
        villes.add("Sélectionnez une ville");
        villes.add("Marrakech");
        villes.add("Tanger");
        villes.add("Casablanca");
        villes.add("Rabat");
        villes.add("Agadir");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, villes);
        villeSpinner.setAdapter(adapter);


btnEnvoyer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String nom=nomPrenomEditTxt.getText().toString();
        String email=emailEditTxt.getText().toString();
        String phone=phoneEditTxt.getText().toString();
        String adresse=adresseEditTxt.getText().toString();
        String ville=villeSpinner.getSelectedItem().toString();
        int selectedid=radiogenre.getCheckedRadioButtonId();
        RadioButton selectedRadioButton = findViewById(selectedid);
        String genre = selectedRadioButton != null ? selectedRadioButton.getText().toString() : "Non spécifié";
        Intent intent=new Intent(MainActivity2.this,RecapActivity.class);
        intent.putExtra("nom",nom);
        intent.putExtra("email",email);
        intent.putExtra("phone",phone);
        intent.putExtra("adresse",adresse);
        intent.putExtra("ville",ville);
        intent.putExtra("genre",genre);
        startActivity(intent);

    }
});



     
    }
}