package com.example.lab_3_sas_houda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editPrenomNom, editMail, editTel, editRue, editVille;
    private Button btnSoumettre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrenomNom = findViewById(R.id.edit_prenom_nom);
        editMail      = findViewById(R.id.edit_mail);
        editTel       = findViewById(R.id.edit_tel);
        editRue       = findViewById(R.id.edit_rue);
        editVille     = findViewById(R.id.edit_ville);
        btnSoumettre  = findViewById(R.id.btn_soumettre);

        btnSoumettre.setOnClickListener(v -> {
            String sPrenomNom = editPrenomNom.getText().toString().trim();
            String sMail      = editMail.getText().toString().trim();
            String sTel       = editTel.getText().toString().trim();
            String sRue       = editRue.getText().toString().trim();
            String sVille     = editVille.getText().toString().trim();

            if (sPrenomNom.isEmpty() || sMail.isEmpty()) {
                Toast.makeText(this, "Prénom/Nom et e-mail sont requis.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, RecapActivity.class);
            intent.putExtra("prenom_nom", sPrenomNom);
            intent.putExtra("mail",       sMail);
            intent.putExtra("tel",        sTel);
            intent.putExtra("rue",        sRue);
            intent.putExtra("ville",      sVille);
            startActivity(intent);
        });
    }
}