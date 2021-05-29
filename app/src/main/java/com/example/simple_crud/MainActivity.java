package com.example.simple_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Client> clients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clients = new ArrayList<>();

        EditText nom = findViewById(R.id.nom);
        EditText prenom = findViewById(R.id.prenom);
        RadioGroup sexe = findViewById(R.id.sexe);

        ArrayAdapter<Client> adapter = new ArrayAdapter<>(
                getApplicationContext(), android.R.layout.simple_list_item_1, clients);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

        Button save = findViewById(R.id.save);
        save.setOnClickListener(v -> {
            RadioButton selectedSexe = findViewById(sexe.getCheckedRadioButtonId());

            Client client = new Client(
                    nom.getText().toString(),
                    prenom.getText().toString(),
                    selectedSexe.getText().toString()
            );
            adapter.add(client);

            nom.setText("");
            prenom.setText("");
        });

    }
}