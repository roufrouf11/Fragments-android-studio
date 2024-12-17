package com.example.app_ergasia1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.result.ActivityResultLauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


//Here is java code for the main menu
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        //kanw to button1 invisible sthn arxh (AKOMAA YPARXEI to koumpi omws sto MainActivity
        Button radbut1=findViewById(R.id.radioButton1);
        radbut1.setVisibility(View.INVISIBLE);


        Button radbut2=findViewById(R.id.radioButton2);
        radbut2.setVisibility(View.INVISIBLE);


        Button radbut3=findViewById(R.id.radioButton3);
        radbut3.setVisibility(View.INVISIBLE);


        Button radbut4=findViewById(R.id.radioButton4);
        radbut4.setVisibility(View.INVISIBLE);


    }

    //etoimi synartisi gia na parw kati apo to register activity (kati intent ktl kai pairnei string
    //gt thelw to input tou xrhsth apo to to register activity
    androidx.activity.result.ActivityResultLauncher<Intent> ActivityResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        if (data != null) {
                            //epistrefw to minima mesw twn returnMessage pou onomasa !!
                            TextView text = (TextView) findViewById(R.id.HelloText);
                            text.setText("Hello :  " + data.getStringExtra("returnMessage1")
                            + " " + data.getStringExtra("returnMessage2") + "\n"
                            + "Now you are ready to select your options:");

                           //kanw invisible to koumpi otan epistrepsei stin main jana
                            //(STILL LAYOUT HAS IT!!)
                            Button regBut= findViewById(R.id.RegisterButton);
                            regBut.setVisibility(View.INVISIBLE);

                            //setarw visible ta radio buttons na fainontai meta

                            Button radbut1=findViewById(R.id.radioButton1);
                            radbut1.setVisibility(View.VISIBLE);

                            Button radbut2=findViewById(R.id.radioButton2);
                            radbut2.setVisibility(View.VISIBLE);

                            Button radbut3=findViewById(R.id.radioButton3);
                            radbut3.setVisibility(View.VISIBLE);

                            Button radbut4=findViewById(R.id.radioButton4);
                            radbut4.setVisibility(View.VISIBLE);
                        }
                    }
                }
            });

    // h synartisi gia na diourgisw gefyra(enwsw tin main pou eimai(this) me thn register activity)
    public void nextRegister(View view) {
        Intent setResultsIntent = new Intent(this, Register_page.class);

        ActivityResultLauncher.launch(setResultsIntent);


    }



    public void onRadioButtonClicked(View view) {

        //arxikopoiw to intent
        Intent intent;

        //me tin boolean elegxw to analogo koumpi
        boolean checked = ((RadioButton) view).isChecked();

        //kanw switch case me to analogo id
        //meta me thn if to elegxei gia na synexisei
        //dimiourgw mia gefyra intent me to activity p eimai kai pou thelw na paw
        //kai me to putExtra pernaw kati an ginei BUTTON_CLICKED tote pairnietai to value button1
        //kai kati tha ginei -> to vlepw sto second activity ti exw orisei na ginetai
        //kai kanw start intent dld jekinaei h gefyra
        //epanalamvanw gia ola ta cases
        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked) {
                    intent = new Intent(MainActivity.this, second_nomoi.class);
                    intent.putExtra("BUTTON_CLICKED", "button1");
                    startActivity(intent);
                    break;
                }
            case R.id.radioButton2:
                if (checked) {
                    intent = new Intent(MainActivity.this, second_nomoi.class);
                    intent.putExtra("BUTTON_CLICKED", "button2");
                    startActivity(intent);
                    break;
                }
            case R.id.radioButton3:
                if (checked) {
                    intent = new Intent(MainActivity.this, second_nomoi.class);
                    intent.putExtra("BUTTON_CLICKED", "button3");
                    startActivity(intent);
                    break;
                }
            case R.id.radioButton4:
                if (checked) {
                    intent = new Intent(MainActivity.this, second_nomoi.class);
                    intent.putExtra("BUTTON_CLICKED", "button4");
                    startActivity(intent);
                    break;
                }
        }
    }



}