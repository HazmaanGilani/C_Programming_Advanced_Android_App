package com.cprograms.mproject.cprograms;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.webkit.WebView;


public class Detail extends ActionBarActivity {

    String program;
    String algo;
    int id;
    int abtid;
    int alid;
    //private RevMobFullscreen fullscreen;
    //private boolean fullscreenIsLoaded;
    //private RevMob revmob;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setElevation(4);
        //overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final WebView webview=(WebView) findViewById(R.id.webview);
        webview.setInitialScale(125);
        webview.getSettings().setBuiltInZoomControls(true);
        program=getIntent().getExtras().getString("title");
        algo=getIntent().getExtras().getString("aid");
        id=getIntent().getExtras().getInt("folderid");
        abtid=getIntent().getExtras().getInt("abt");

        webview.getSettings().setJavaScriptEnabled(true);
        getSupportActionBar().setTitle(program);
        if(id==1) {
            webview.loadUrl("file:///android_asset/" + program + ".html");
        }
        else if (id==2){
            webview.loadUrl("file:///android_asset/Topic/" + program + ".html");

        }

          if(abtid==3) {
              webview.loadUrl("file:///android_asset/Topic/about.html");
              getSupportActionBar().setTitle("About");
          }
        else if (abtid==4) {
            webview.loadUrl("file:///android_asset/Algo/" + algo + ".html");
            getSupportActionBar().setTitle(algo);
        }



    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);
        overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);

    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}