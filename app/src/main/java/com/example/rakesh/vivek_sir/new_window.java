package com.example.rakesh.vivek_sir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class new_window extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_window);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        Button button1 = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);

        TextView textView = (TextView)findViewById(R.id.textView4);

        button1.getBackground().setAlpha(150);
        button2.getBackground().setAlpha(150);


        Bundle extras = getIntent().getExtras();
        Intent intent = this.getIntent();

        /* Obtain String from Intent  */
        if(intent !=null) {
            String strdata = intent.getExtras().getString("key");
            if (strdata.equals("url_dcr")) {

                Log.e("rak", "dcr");
                button1.setText("Fill D.c.r");
                button2.setText("View D.c.r");

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(new_window.this, webi.class);
                        myIntent.putExtra("key", "fill_dcr"); //Optional parameters
                        new_window.this.startActivity(myIntent);
                    }
                });



                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(new_window.this, webi.class);
                        myIntent.putExtra("key", "view_dcr"); //Optional parameters
                        new_window.this.startActivity(myIntent);
                    }
                });


            }
            ///
            if (strdata.equals("url_hrms")) {
                textView.setText("H.R.M.S");
                Log.e("rak", "hrms");
                button1.setText("Fill H.R.M.S");
                button2.setText("View H.R.M.S");

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(new_window.this, webi.class);
                        myIntent.putExtra("key", "fill_hrms"); //Optional parameters
                        new_window.this.startActivity(myIntent);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(new_window.this, webi.class);
                        myIntent.putExtra("key", "view_hrms"); //Optional parameters
                        new_window.this.startActivity(myIntent);
                    }
                });
            }
            if (strdata.equals("url_cr")) {
                textView.setText("C.R");
                Log.e("rak", "cr");
                button1.setText("Fill C.R Data");
                button2.setText("View C.R Data");

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(new_window.this, webi.class);
                        myIntent.putExtra("key", "fill_cr_data"); //Optional parameters
                        new_window.this.startActivity(myIntent);
                    }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent myIntent = new Intent(new_window.this, webi.class);
                        myIntent.putExtra("key", "view_cr_data"); //Optional parameters
                        new_window.this.startActivity(myIntent);
                    }
                });
            }

        }


    }

}
