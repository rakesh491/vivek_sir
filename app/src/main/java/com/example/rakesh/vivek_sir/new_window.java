package com.example.rakesh.vivek_sir;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class new_window extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_window);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        Button button1 = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);

        button1.getBackground().setAlpha(150);
        button2.getBackground().setAlpha(150);

        Bundle extras = getIntent().getExtras();
        Intent intent = this.getIntent();

        /* Obtain String from Intent  */
        if(intent !=null) {
            String strdata = intent.getExtras().getString("key");
            if (strdata.equals("url_dcr")) {
                Log.e("rak", "dcr");
                button1.setText("Fill Dcr");
                button2.setText("View Dcr");

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
                Log.e("rak", "hrms");
                button1.setText("Fill HRMS");
                button2.setText("View HRMS");

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
                Log.e("rak", "cr");
                button1.setText("Fill CR Data");
                button2.setText("View CR Data");

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
