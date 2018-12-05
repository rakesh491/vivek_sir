package com.example.rakesh.vivek_sir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rakesh extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rakesh);
        Button button1 = (Button)findViewById(R.id.button3);
        Button button2 = (Button)findViewById(R.id.button4);
        Button button3 = (Button)findViewById(R.id.button5);
        Button button4 = (Button)findViewById(R.id.button6);

        TextView textView = (TextView)findViewById(R.id.textView3);

        button1.getBackground().setAlpha(150);
        button2.getBackground().setAlpha(150);

        button3.getBackground().setAlpha(150);
        button4.getBackground().setAlpha(150);

        Intent intent = this.getIntent();

        /* Obtain String from Intent  */
        if(intent !=null) {
            String strdata = intent.getExtras().getString("key");
            if (strdata.equals("url_dcr")) {
                textView.setText("D.C.R");
                button1.setText("Fill D.c.r");
                button2.setText("View D.c.r");

                button3.setText("Fill D.c.r");
                button4.setText("View D.c.r");

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "fill_dcr_bosh"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "view_dcr_bosh"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "fill_dcr_siemens"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "view_dcr_siemens"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

            }

            if(strdata.equals("url_book_rec")){
                textView.setText("Students Book Record");

                button1.setText("Fill Student Book Record");
                button2.setText("View Student Book Record");

                button3.setText("Fill Student Book Record");
                button4.setText("View Student Book Record");
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "fill_book_rec_bosh"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "view_book_rec_bosh"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "fill_book_rec_siemens"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(rakesh.this, webi.class);
                        myIntent.putExtra("key", "view_book_rec_siemens"); //Optional parameters
                        rakesh.this.startActivity(myIntent);
                    }
                });
            }
        }
    }
}
