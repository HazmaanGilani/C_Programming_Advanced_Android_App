package com.cprograms.mproject.cprograms;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_action_icon);
        overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
        //getSupportActionBar().setTitle("C Programing Hub");
        getSupportActionBar().setTitle("C Programming");
        getSupportActionBar().setElevation(4);
        final Animation animbutton= AnimationUtils.loadAnimation(this,R.anim.but);
        final Button prg_list_basic=(Button)findViewById(R.id.basic_prg);
        final Button prg_list_advance=(Button)findViewById(R.id.advance_prg);
        Button prg_list_ds=(Button)findViewById(R.id.data_prg);
        Button faq=(Button)findViewById(R.id.faq_btn);
        Button ref_list_fundamental=(Button)findViewById(R.id.fundamental_btn);
        Button ref_list_ds=(Button)findViewById(R.id.datstructure_btn);
        Button quiz_btn=(Button)findViewById(R.id.quiz_btn);
        Button quit=(Button)findViewById(R.id.exit_btn);
        //Button about=(Button)findViewById(R.id.abt_btn);
        Button algo_btn=(Button)findViewById(R.id.algo_btn);


        prg_list_basic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                Intent intent = new Intent(MainActivity.this, ProgramList.class);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                intent.putExtra("id", 1);

                startActivity(intent);
            }
        });
        prg_list_advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                Intent intent=new Intent(MainActivity.this,ProgramList.class);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                intent.putExtra("id",2);

                startActivity(intent);
            }
        });
        prg_list_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent=new Intent(MainActivity.this,ProgramList.class);
                intent.putExtra("id",3);

                startActivity(intent);
            }
        });
        ref_list_fundamental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent = new Intent(MainActivity.this, ProgramList.class);
                intent.putExtra("id", 4);

                startActivity(intent);
            }
        });

        ref_list_ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent=new Intent(MainActivity.this,ProgramList.class);
                intent.putExtra("id",5);

                startActivity(intent);
            }
        });
        algo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent=new Intent(MainActivity.this,algo.class);
                startActivity(intent);

            }
        });


        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent=new Intent(MainActivity.this,FAQ.class);
                startActivity(intent);

            }
        });
        quiz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent=new Intent(MainActivity.this,Quiz.class);
                startActivity(intent);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.startAnimation(animbutton);
                onBackPressed();
            }
        });


      /*  about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animbutton);
                overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
                Intent intent=new Intent(MainActivity.this,Detail.class);
                intent.putExtra("abt",3);
                startActivity(intent);
            }
        });*/


    }








    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Exit")
                .setMessage("Are you sure you want to Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            Intent shareintent=new Intent();
            shareintent.setAction(Intent.ACTION_SEND);
            shareintent.putExtra(Intent.EXTRA_TEXT, "Check out this app:https://play.google.com/store/apps/details?id=com.cprograms.mproject.cprograms");
            //shareintent.putExtra(Intent.EXTRA_TEXT, "Check out this app:https://www.amazon.com/gp/mas/dl/android?p=com.cprograms.mproject.cprograms");
            shareintent.setType("text/plain");
            startActivity(shareintent);
            return true;
        }
        if(id==R.id.action_suggest){
            Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

            String[] recipients = new String[]{"mail.nextstudio@gmail.com", "",};

            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);

            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "C Programming v2:Suggestions:");

            emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "");

            emailIntent.setType("message/rfc822");

            startActivity(Intent.createChooser(emailIntent, "Send mail..."));

            finish();


        }

        if (id==R.id.action_rate){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.cprograms.mproject.cprograms"));
            //intent.setData(Uri.parse("amzn://apps/android?p=com.cprograms.mproject.cprograms"));
            startActivity(intent);
        }
        if (id==R.id.action_feedback){
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.cprograms.mproject.cprograms"));
            //intent.setData(Uri.parse("amzn://apps/android?p=com.cprograms.mproject.cprograms"));
            startActivity(intent);
        }

        if(id==R.id.action_report){
            Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

            String[] recipients = new String[]{"mail.nextstudio@gmail.com", "",};

            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);

            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "C Programming  v2:Bug Report:");

            emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "");

            emailIntent.setType("message/rfc822");

            startActivity(Intent.createChooser(emailIntent, "Send mail..."));

            finish();
        }


        return super.onOptionsItemSelected(item);
    }



}
