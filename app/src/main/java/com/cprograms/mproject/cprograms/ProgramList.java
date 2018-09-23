package com.cprograms.mproject.cprograms;

import android.content.Intent;
import android.content.res.Resources;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.ActionBarActivity;

public class ProgramList extends ActionBarActivity {
    ArrayAdapter<String> adapter;
    String[] mList;
    int id;
    int idd;
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program_list);
        getSupportActionBar().setElevation(4);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);


        Resources resource=getResources();
        id=getIntent().getExtras().getInt("id");
        if(id==1){
            mList=resource.getStringArray(R.array.ProgramList_basic);
            idd=1;

        }
       else if (id==2){
            mList=resource.getStringArray(R.array.ProgramList_advance);
            idd=1;
        }
        else if (id==3){
            mList=resource.getStringArray(R.array.ProgramList_ds);
            idd=1;
        }
        else if (id==4){
            mList=resource.getStringArray(R.array.TopicList_fundamental);
            idd=1;
            getSupportActionBar().setTitle("C Essentials");
        }
        else if (id==5){
            mList=resource.getStringArray(R.array.TopicList_ds);
            idd=2;
            getSupportActionBar().setTitle("Data Structures");
        }




        list =(ListView)findViewById(R.id.listView);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,mList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                        Intent intent = new Intent(ProgramList.this, Detail.class);
                        intent.putExtra("title", mList[position]);
                        intent.putExtra("folderid",idd);
                       // overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
                        startActivity(intent);


                    }
                }
        );


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);

    }


    }
