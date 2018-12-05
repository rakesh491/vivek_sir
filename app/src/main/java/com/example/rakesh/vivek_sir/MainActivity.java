package com.example.rakesh.vivek_sir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        final String url_bosch_logo = "url_bosch_logo";
        final String url_college_logo = "url_college_logo";

        final String url_dcr = "url_dcr";
        final String url_hrms = "url_hrms";
        final String url_cr = "url_cr";
        final String url_stud_reg = "url_stud_reg";
        final String url_book_rec = "url_book_rec";
        final String url_news = "url_news";
        final String url_work_schedule = "url_work_schedule";


        ImageView bosch_logo = (ImageView)findViewById(R.id.imageView3);
        ImageView college_logo = (ImageView)findViewById(R.id.imageView4);

        Button dcr = (Button)findViewById(R.id.dcr);
        Button hrms = (Button)findViewById(R.id.hrms);
        Button cr = (Button)findViewById(R.id.cr);
        Button stud_reg = (Button)findViewById(R.id.stud_reg);
        Button stud_book_rec = (Button)findViewById(R.id.stud_book_rec);
        Button news = (Button)findViewById(R.id.news);
        Button work_schedule = (Button)findViewById(R.id.work_schedule);
        Button exit = (Button)findViewById(R.id.exit);


        bosch_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, webi.class);
                myIntent.putExtra("key", url_bosch_logo); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        bosch_logo.getBackground().setAlpha(105);

        college_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, webi.class);
                myIntent.putExtra("key", url_college_logo); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });

        dcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, rakesh.class);
                myIntent.putExtra("key", url_dcr); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        dcr.getBackground().setAlpha(150);

        hrms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, new_window.class);
                myIntent.putExtra("key", url_hrms); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        hrms.getBackground().setAlpha(150);

        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, new_window.class);
                myIntent.putExtra("key", url_cr); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        cr.getBackground().setAlpha(150);

        stud_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, webi.class);
                myIntent.putExtra("key", url_stud_reg); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        stud_reg.getBackground().setAlpha(150);

        stud_book_rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, rakesh.class);
                myIntent.putExtra("key", url_book_rec); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        stud_book_rec.getBackground().setAlpha(150);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, webi.class);
                myIntent.putExtra("key", url_news); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        news.getBackground().setAlpha(150);

        work_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, webi.class);
                myIntent.putExtra("key", url_work_schedule); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
        work_schedule.getBackground().setAlpha(150);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        exit.getBackground().setAlpha(150);
    }
}
