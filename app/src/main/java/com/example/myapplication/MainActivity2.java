package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        EditText Nom = findViewById(R.id.editnom);
        EditText Email = findViewById(R.id.emailtxt);
        EditText Phone = findViewById(R.id.editTextPhone);
        EditText Adresse = findViewById(R.id.adresseedittxt);
        Spinner Ville = findViewById(R.id.villespinner);
        RadioButton Masculin= findViewById(R.id.masculin);
        RadioButton Feminin=findViewById(R.id.feminin);
        RadioGroup radiogenre=findViewById(R.id.radiogenre);
        Button Envoyer=findViewById(R.id.btnenvoyer);
Envoyer.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String nom=Nom.getText().toString();
        String email=Email.getText().toString();
        String phone=Phone.getText().toString();
        String adresse=Adresse.getText().toString();
        String ville=Ville.getSelectedItem().toString();
        int selectedid=radiogenre.getCheckedRadioButtonId();
        String genre="";
        if(selectedid== R.id.masculin){
            genre="Homme";
        }
        else if (selectedid==R.id.feminin){
             genre= "Femme";
        }
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