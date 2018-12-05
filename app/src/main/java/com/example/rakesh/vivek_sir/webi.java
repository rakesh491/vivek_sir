package com.example.rakesh.vivek_sir;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webi);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        WebView webView = (WebView)findViewById(R.id.webview);

        final String url_bosch_logo = "https://www.boschrexroth.com/en/xc/";
        final String url_college_logo = "http://boschrexroth.cvrgi.edu.in/";

        final String url_fill_dcr_bosh = "https://docs.google.com/forms/d/e/1FAIpQLSc_QWljWrnBAbYqs1_ba2dJHolq1MzNR0t1-glTBLTddqWUqA/viewform?usp=sf_link";
        final String url_view_dcr_bosh = "https://docs.google.com/spreadsheets/d/1wrioeLw2RHuoTTHOs26mF3IDfnR4a2wAtHIyM1x5dqE/edit?usp=sharing";
        final String url_fill_dcr_siemens = "https://docs.google.com/forms/d/e/1FAIpQLScMB0JN6wP9r-aDvlyqNob2HurzFEkyvfdd3OKyalLWHz1pIA/viewform";
        final String url_view_dcr_siemens = "https://docs.google.com/spreadsheets/d/1V9w9diu9iFflULVF8pnhPmuJWyYkB9AVgNmVIAH893U/edit?usp=sharing";

        final String url_fill_hrms = "https://docs.google.com/forms/d/1VF5RENDLB1ucuycQvEmUtl3cZLBm8jD1wLH7XzZnMhA/edit?fbzx=2068935654946502400";
        final String url_view_hrms = "https://docs.google.com/spreadsheets/d/1rxnSLbZezdDGVDdHLOuTvWDnkJTKloVBY1COTsfyZ-E/edit?usp=sharing";
        final String url_fill_cr = "https://docs.google.com/forms/d/e/1FAIpQLSfYvStSaj2ekEFQp2CQiUYvS-1pqhKha8Wq6A_48CMsjMMzRA/viewform";
        final String url_view_cr = "https://docs.google.com/spreadsheets/d/1tGbzdrKiWEuob97MOh2rUclV5cp_jRqjrRK3x56xvHU/edit?usp=sharing";
        final String url_stud_reg = "https://docs.google.com/spreadsheets/d/12eUCj02QNfJ8br_yEyTUM-YChnNr-jL_fZ1N6RVjemE/edit?usp=sharing";
   //     final String url_book_rec =

        final String url_fill_book_rec_bocsh = "https://docs.google.com/forms/d/1ug-aAdve_cwzMXgTYZ5Y_-iSaAFLcabarW-AQHlrRwc/edit";
        final String url_view_book_rec_bocsh = "https://docs.google.com/spreadsheets/d/1WuMYvP2HXWqMhKCLZokU2j0IN_U43n7RvbDbhI75JTg/edit?usp=sharing";
        final String url_fill_book_rec_siemens = "https://docs.google.com/forms/d/e/1FAIpQLSdYejuvbk7wmgaRpni9YdcosUCsu9NbQKjV0p69Z_M2BqOcBg/viewform";
        final String url_view_book_rec_siemens = "https://docs.google.com/spreadsheets/d/1bzEAE1sQFJmuTL56UIFo2n18e1h2XTx-y3ie9dvW-3U/edit?usp=sharing";


        final String url_news = "http://boschrexroth.cvrgi.edu.in/news-and-events.php";
        final String url_work_schedule = "https://docs.google.com/spreadsheets/d/15CA906Mg4zzsbRFs8A2RJ5rkfSp_PxNDhOJDbfsWN7A/edit?usp=sharing";



        Bundle extras = getIntent().getExtras();
        Intent intent = this.getIntent();

        String url_string = "https://NIL";

        /* Obtain String from Intent  */
        if(intent !=null) {
            String strdata = intent.getExtras().getString("key");
            if (strdata.equals("url_bosch_logo")) {
                Log.e("rak","bosh");
                url_string = "https://www.boschrexroth.com/en/xc/";
            }
            if (strdata.equals("url_college_logo")) {
                Log.e("rak","colege");
                url_string = url_college_logo;
            }
            if (strdata.equals("fill_dcr_bosh")) {
                url_string = url_fill_dcr_bosh;
            }
            if(strdata.equals("view_dcr_bosh")){
                url_string = url_view_dcr_bosh;
            }
            if (strdata.equals("fill_dcr_siemens")) {
                url_string = url_fill_dcr_siemens;
            }
            if(strdata.equals("view_dcr_siemens")){
                url_string = url_view_dcr_siemens;
            }
            if(strdata.equals("fill_hrms")){
                url_string = url_fill_hrms;
            }
            if(strdata.equals("view_hrms")){
                url_string = url_view_hrms;
            }
            if(strdata.equals("fill_cr_data")){
                url_string = url_fill_cr;
            }
            if(strdata.equals("view_cr_data")){
                url_string = url_view_cr;
            }
            if(strdata.equals("url_stud_reg")){
                url_string = url_stud_reg;
            }
            if(strdata.equals("fill_book_rec_bosh")){
                url_string = url_fill_book_rec_bocsh;
            }
            if(strdata.equals("view_book_rec_bosh")){
                url_string = url_view_book_rec_bocsh;
            }
            if(strdata.equals("fill_book_rec_siemens")){
                url_string = url_fill_book_rec_siemens;
            }
            if(strdata.equals("view_book_rec_siemens")){
                url_string = url_view_book_rec_siemens;
            }
            if(strdata.equals("url_news")){
                url_string = url_news;
            }
            if(strdata.equals("url_work_schedule")){
                url_string = url_work_schedule;
            }
        }

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url_string);


    }
}
