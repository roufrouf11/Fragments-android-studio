package com.example.app_ergasia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class second_nomoi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_nomoi);

        //arxikopoiw koumpia me vash to id na ta vriskei
        Button button1 = findViewById(R.id.button_s_1);
        Button button2 = findViewById(R.id.button_s_2);
        Button button3 = findViewById(R.id.button_s_3);
        Button button4 = findViewById(R.id.button_s_4);

        //arxikopoiw gefyra gia na parw ta data pou esteile to prohgoumeno activity
        Intent intent = getIntent();

        //an patithei to button_clicked pou eipame pairnei ta onomata button1,button2....
        //kai me vash auta ta onomata vazw ti thelw na emfanizetai se kathe case
        String buttonClicked = intent.getStringExtra("BUTTON_CLICKED");
        if (buttonClicked.equals("button1")) {
            button1.setText("N.Larisa");
            button2.setText("N.Trikala");
            button3.setText("N.Karditsa");
            button4.setText("N.Magnisias");
        }
        else if (buttonClicked.equals("button2")) {
            button1.setText("N.Drama");
            button2.setText("N.Xanthi");
            button3.setText("N.Alexandroupoli");
            button4.setText("N.Kavala");
        }
        else if (buttonClicked.equals("button3")) {
            button1.setText("N.Patra");
            button2.setText("N.Tripoli");
            button3.setText("N.Nauplio");
            button4.setText("N.Kalamata");
        }
        else if (buttonClicked.equals("button4")) {
            button1.setText("N.Mykonos");
            button2.setText("N.Ios");
            button3.setText("N.Naxos");
            button4.setText("N.Paros");
        }



    }

    public void onButton_s_Clicked(View view) {

        //arxikopoiw to intent
        Intent intent;

        //twra tha ftiajw switch gia ta cases twn koumpiwn

        switch (view.getId()) {
            case R.id.button_s_1:

            //dhmiourgw gefyra me to pio layout thelw na paw

                intent = new Intent(second_nomoi.this, third_polh.class);

                //vriskw to koumpi
                //kai ftiaxnw 4 poleis oses oi pithanes epiloges ws string(text tou) pou tha xei

                Button button1 = findViewById(R.id.button_s_1);
                String button1Text=button1.getText().toString();

                String s1= "N.Larisa";
                String s2="N.Drama";
                String s3="N.Patra";
                String s4="N.Mykonos";

                //gia auta ta string p tha exei kathe koumpi(kathe koumpi tis dikes tou text4 epiloges)
                //kanw ena if opou tha pairnw to text tou koumioy kai me to analogo text
                //tou lew na paei sto analogo activity kai na perasei ena value (stin prokeimenh
                // to value tha einai h polh pou tha exei kathe nomos)
                //epanalavbanw gia tis 4 periptwseis 4 koumpiou kai gia ta 4 koumpia

                if (button1.getText().toString().equals(s1)) {
                    intent.putExtra("polh1", "LARISA");
                    startActivity(intent);
                    break;
                }
                else if(button1.getText().toString().equals(s2)) {
                    intent.putExtra("polh2", "DRAMA");
                    startActivity(intent);
                    break;
                }
                else if (button1.getText().toString().equals(s3)) {
                    intent.putExtra("polh3", "PATRA");
                    startActivity(intent);
                    break;
                }
                else if(button1.getText().toString().equals(s4)) {
                    intent.putExtra("polh4", "MYKONOS");
                    startActivity(intent);
                    break;
                }



            case R.id.button_s_2:

                intent = new Intent(second_nomoi.this, third_polh.class);


                Button button2 = findViewById(R.id.button_s_2);
                String button2Text=button2.getText().toString();


                String s5= "N.Trikala";
                String s6="N.Xanthi";
                String s7="N.Tripoli";
                String s8="N.Ios";



                if (button2.getText().toString().equals(s5)) {
                    intent.putExtra("polh1", "TRIKALA");
                    startActivity(intent);
                    break;
                }
                else if(button2.getText().toString().equals(s6)) {
                    intent.putExtra("polh2", "XANTHI");
                    startActivity(intent);
                    break;
                }
                else if (button2.getText().toString().equals(s7)) {
                    intent.putExtra("polh3", "TRIPOLH");
                    startActivity(intent);
                    break;
                }
                else if(button2.getText().toString().equals(s8)) {
                    intent.putExtra("polh4", "IOS");
                    startActivity(intent);
                    break;
                }


            case R.id.button_s_3:

                intent = new Intent(second_nomoi.this, third_polh.class);


                Button button3 = findViewById(R.id.button_s_3);
                String button3Text=button3.getText().toString();


                String s9= "N.Karditsa";
                String s10="N.Alexandroupoli";
                String s11="N.Nauplio";
                String s12="N.Naxos";



                if (button3.getText().toString().equals(s9)) {
                    intent.putExtra("polh1", "KARDITSA");
                    startActivity(intent);
                    break;
                }
                else if(button3.getText().toString().equals(s10)) {
                    intent.putExtra("polh2", "ALEXANDROUPOLH");
                    startActivity(intent);
                    break;
                }
                else if (button3.getText().toString().equals(s11)) {
                    intent.putExtra("polh3", "NAYPLIO");
                    startActivity(intent);
                    break;
                }
                else if(button3.getText().toString().equals(s12)) {
                    intent.putExtra("polh4", "NAXOS");
                    startActivity(intent);
                    break;
                }

            case R.id.button_s_4:

                intent = new Intent(second_nomoi.this, third_polh.class);


                Button button4 = findViewById(R.id.button_s_4);
                String button4Text=button4.getText().toString();


                String s13= "N.Magnisias";
                String s14="N.Kavala";
                String s15="N.Kalamata";
                String s16="N.Paros";



                if (button4.getText().toString().equals(s13)) {
                    intent.putExtra("polh1", "BOLOS");
                    startActivity(intent);
                    break;
                }
                else if(button4.getText().toString().equals(s14)) {
                    intent.putExtra("polh2", "KAVALA");
                    startActivity(intent);
                    break;
                }
                else if (button4.getText().toString().equals(s15)) {
                    intent.putExtra("polh3", "KALAMATA");
                    startActivity(intent);
                    break;
                }
                else if(button4.getText().toString().equals(s16)) {
                    intent.putExtra("polh4", "PAROS");
                    startActivity(intent);
                    break;
                }



        }
    }

}





