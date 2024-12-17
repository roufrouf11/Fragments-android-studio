package com.example.app_ergasia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Register_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
    }
    //gia to koympi  epistrefei auta p tha tou dwsw sto main  to main activity
    //ftiaxnw tin parakatw synartisi (onClick) gia to ti tha epistrepsw otan ginei click to ready button
    public void NextMainActivityClickButton(View view) {

        //orizw ws edit text ena msg p to vriskw kai to vazw na einai to text me id: first name
        EditText msg1  = (EditText) findViewById(R.id.FirstName);
        EditText msg2  = (EditText) findViewById(R.id.LastName);
        //dimiourgw gefyra
        Intent intent = new Intent();
        //pernaw to msg se ena return message ws value
        intent.putExtra("returnMessage1", msg1.getText().toString());
        intent.putExtra("returnMessage2", msg2.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }
}