package com.example.enoy_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnChoice1);
        Button btnDecision2 = findViewById(R.id.btnChoice2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("Cutting Class");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){


        TextView txtDecision = findViewById(R.id.txtOutcome);



        switch (view.getId()) {
            case R.id.btnChoice1:
                txtDecision.setText("GO WITH FRIENDS - You will just let yourself miss some activities just to have fun.");
                break;
            case R.id.btnChoice2:
                txtDecision.setText("DECLINE - You will stay inside the school until the class is over.");
                break;
        }
    }
}

