package com.example.lab_3_sas_houda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RecapActivity extends AppCompatActivity {

    private TextView textRecap;
    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        textRecap = findViewById(R.id.text_recap);
        btnRetour = findViewById(R.id.btn_retour);

        Intent intent = getIntent();
        String prenomNom = intent.getStringExtra("prenom_nom");
        String mail      = intent.getStringExtra("mail");
        String tel       = intent.getStringExtra("tel");
        String rue       = intent.getStringExtra("rue");
        String ville     = intent.getStringExtra("ville");

        String resume =
                "Prénom & Nom : " + afficher(prenomNom) +
                        "\nE-mail : "      + afficher(mail)      +
                        "\nTéléphone : "   + afficher(tel)        +
                        "\nRue : "         + afficher(rue)        +
                        "\nVille : "       + afficher(ville);

        textRecap.setText(resume);

        btnRetour.setOnClickListener(v -> finish());
    }

    private String afficher(String valeur) {
        return (valeur == null || valeur.trim().isEmpty()) ? "non renseigné" : valeur.trim();
    }
}