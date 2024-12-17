package com.example.app_ergasia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class third_polh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_polh);


        TextView text1 = findViewById(R.id.textPolhs);

        //auto mporei k na min einai aparaitito
        Intent intent = getIntent();

        //orizw 4 string gia na pairnw ta analoga values apo tis gefyres

        String text1_1 = getIntent().getStringExtra("polh1");
        String text2_2 = getIntent().getStringExtra("polh2");
        String text3_3 = getIntent().getStringExtra("polh3");
        String text4_4 = getIntent().getStringExtra("polh4");

        //kanw elegxw loop gia na dw poia den einai kena kai na lavw to apotelesma
        //apotelesma thelw to text1_kati opou einai stin ousia to value apo to polh_kati name
        //kanw 4 elegxous gia ta text1,2,3,4_kati kai mesa sta if tous alla 4 cases gia kathe
        //polh1,2,3,4 wste na vrw maps...

        if (text1_1 != null) {
            text1.setText("One city of the county you selected is : " + text1_1);

            //twra analoga me thn polh pou exw parei kai thn exw valei sto text1_kati
            //kanw ena case gia to analogo string pou tha exei na anoigw to url xarti
            switch (text1_1) {
                //estw oti to string ="LARISA"
                case "LARISA":
                    //tis moires tou xarth tis vrhka sto google gia kathe polh
                    //Larisa: 39.6396° N, 22.4200° E

                    //vriskw to buttonMap kai me tin synartisi setOnClickListener
                    //einai etoimh kai apantaei sto an tha patithei to koumpi
                    //vazwe to location
                    //kai kanw mia kainourgia gefyra intent
                    //me tin current topothesia kai to location( p stin ousia einai to google maps)
                    //kai an den einai keno auto tote ekteleitai to aktivity kai phgainw sto maps
                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:39.6396, 22.4200?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    //vriskw to buttonWiki kai me tin onclick listener
                    //otan patithei to koumpi paei sto url
                    //to url deixnei mia istoselida (ginetai intent kai paei ktl..)

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                    String url = "https://el.wikipedia.org/wiki/%CE%9B%CE%AC%CF%81%CE%B9%CF%83%CE%B1";
                    Uri webpage = Uri.parse(url);
                    Intent webIntent = new Intent(Intent.ACTION_VIEW);
                    webIntent.setData(webpage);
                    if (webIntent.resolveActivity(getPackageManager()) != null) {
                        startActivity(webIntent);
                    }
                });


                    break;

                    //omoia opws prin epanalambanw gia oles tis periptwseis...

                case "TRIKALA":
                    //Trikala: 39.5555° N, 21.7679° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:39.5555, 21.7679?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%A4%CF%81%CE%AF%CE%BA%CE%B1%CE%BB%CE%B1";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;


                case "KARDITSA":
                    //Karditsa: 39.3650° N, 21.9214° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:39.3650, 21.9214?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });


                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CF%81%CE%B4%CE%AF%CF%84%CF%83%CE%B1";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });



                    break;


                case "BOLOS":
                    //Volos: 39.3644° N, 22.9471° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:39.3644, 22.9471?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%92%CF%8C%CE%BB%CE%BF%CF%82";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;

                    //auto to default gia to switch case
                default:
                   //kanei break an den ginei kati apo tis 4 parapanw epiloges
                    break;
            }


        } else if (text2_2 != null) {
            text1.setText("One city of the county you selected is :  " + text2_2);


            switch (text2_2) {
                case "DRAMA":
                    //Drama: 41.1527° N, 24.1444° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:41.1527, 24.1444?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%94%CF%81%CE%AC%CE%BC%CE%B1_(%CF%80%CF%8C%CE%BB%CE%B7)";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;


                case "XANTHI":

                    //Xanthi: 41.1411° N, 24.8836° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:41.1411, 24.8836?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });


                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9E%CE%AC%CE%BD%CE%B8%CE%B7";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;


                case "ALEXANDROUPOLH":
                    //Alexandroupoli: 40.8471° N, 25.8749° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:40.8471, 25.8749?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%91%CE%BB%CE%B5%CE%BE%CE%B1%CE%BD%CE%B4%CF%81%CE%BF%CF%8D%CF%80%CE%BF%CE%BB%CE%B7";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;


                case "KAVALA":
                    //Kavala: 40.9367° N, 24.4126° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:40.9367, 24.4126?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CE%B2%CE%AC%CE%BB%CE%B1";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });

                    break;

                default:

                    break;
            }


        } else if (text3_3 != null) {
            text1.setText("One city of the county you selected is : " + text3_3);


            switch (text3_3) {
                case "PATRA":
                    //Patra: 38.2466° N, 21.7346° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:38.2466, 21.7346?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%A0%CE%AC%CF%84%CF%81%CE%B1";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });

                    break;


                case "TRIPOLH":
                    //Tripoli: 37.5086° N, 22.3792° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:37.5086, 22.3792?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%A4%CF%81%CE%AF%CF%80%CE%BF%CE%BB%CE%B7_%CE%91%CF%81%CE%BA%CE%B1%CE%B4%CE%AF%CE%B1%CF%82";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;


                case "NAYPLIO":
                    //Nafplio: 37.5640° N, 22.8048° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:37.5640, 22.8048?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9D%CE%B1%CF%8D%CF%80%CE%BB%CE%B9%CE%BF";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });

                    break;


                case "KALAMATA":
                    //Kalamata: 37.0386° N, 22.1142° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:37.0386, 22.1142?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9A%CE%B1%CE%BB%CE%B1%CE%BC%CE%AC%CF%84%CE%B1";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;

                default:

                    break;
            }


        } else if (text4_4 != null) {
            text1.setText("One city of the county you selected is : " + text4_4);


            switch (text4_4) {
                case "MYKONOS":
                    //Mykonos: 37.4467° N, 25.3289° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:37.4467, 25.3289?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9C%CF%8D%CE%BA%CE%BF%CE%BD%CE%BF%CF%82";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });


                    break;


                case "IOS":
                    //Ios: 36.7245° N, 25.2823° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:36.7245, 25.2823?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%8A%CE%BF%CF%82";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });

                    break;


                case "NAXOS":
                    //Naxos: 37.1020° N, 25.3761° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:37.1020, 25.3761?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%9D%CE%AC%CE%BE%CE%BF%CF%82";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });

                    break;


                case "PAROS":
                    //Paros: 37.0850° N, 25.1489° E

                    findViewById(R.id.buttonMap).setOnClickListener(view -> {
                        Uri location = Uri.parse("geo:37.0850, 25.1489?z=8");
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                        if (mapIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(mapIntent);
                        }
                    });

                    findViewById(R.id.buttonWiki).setOnClickListener(View -> {
                        String url = "https://el.wikipedia.org/wiki/%CE%A0%CE%AC%CF%81%CE%BF%CF%82";
                        Uri webpage = Uri.parse(url);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW);
                        webIntent.setData(webpage);
                        if (webIntent.resolveActivity(getPackageManager()) != null) {
                            startActivity(webIntent);
                        }
                    });

                    break;

                default:

                    break;
            }

        }


    }
}




