package com.cprograms.mproject.cprograms;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Score extends ActionBarActivity {
    int highscore = 0;
    int score;
    int wrong;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_score);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
        getSupportActionBar().setElevation(4);


        getSupportActionBar().setTitle("Result");
        TextView txtscore = (TextView) findViewById(R.id.scoretext);
        TextView txthighscore = (TextView) findViewById(R.id.hightext);
        TextView txtwrong = (TextView) findViewById(R.id.wrongtext);
        final Button exit_btn = (Button) findViewById(R.id.exitbtn);
        Button restart_btn = (Button) findViewById(R.id.restartbtn);

        score = getIntent().getExtras().getInt("Score");
        wrong = getIntent().getExtras().getInt("Wrong");
        txtwrong.setText("Wrong Answers:" + wrong);
        txtscore.setText("Score:" + score);

        highscore = getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE).getInt("key", highscore);

        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        highscore = prefs.getInt("key", highscore);
        if (score == highscore) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putInt("key", score);
            edit.commit();
            highscore = score;
        } else if (score < highscore) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putInt("key", highscore);
            edit.commit();
            highscore = highscore;
        } else if (score > highscore) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putInt("key", score);
            edit.commit();
            highscore = score;
        }


        txthighscore.setText("Highscore:" + highscore);


        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Score.this, MainActivity.class);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
                //ComponentName cn=intent.getComponent();
                //Intent mainintent= IntentCompat.makeRestartActivityTask(cn);
                startActivity(intent);


            }
        });

        restart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(Score.this,Quiz.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        //ComponentName cn=intent.getComponent();
        //Intent mainintent= IntentCompat.makeRestartActivityTask(cn);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
        //ActivityCompat.finishAffinity(this);


    }





}
