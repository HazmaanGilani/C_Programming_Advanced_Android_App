package com.cprograms.mproject.cprograms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class algo extends ActionBarActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        getSupportActionBar().setTitle("Algorithms");
        getSupportActionBar().setElevation(4);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
// get the listview
        expListView = (ExpandableListView) findViewById(R.id.expandableListView2);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                //Toast.makeText(getApplicationContext(),
                        //listDataHeader.get(groupPosition) + " Expanded",
                        //Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                //Toast.makeText(getApplicationContext(),
                        //listDataHeader.get(groupPosition) + " Collapsed",
                        //Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                /*Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();*/
                Intent intent=new Intent(algo.this,Detail.class);
                intent.putExtra("aid", listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition));
                intent.putExtra("abt",4);
                startActivity(intent);
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Introduction");
        listDataHeader.add("AlgorithmDesign");
        listDataHeader.add("Sorting");
        listDataHeader.add("Searching");
        listDataHeader.add("Expressions");
        listDataHeader.add("Tree");
        listDataHeader.add("Graph");


        // Adding child data
        List<String> Introduction = new ArrayList<String>();
        Introduction.add("Introduction");
        Introduction.add("Asymptotic Analysis");


        List<String> AlgorithmDesign = new ArrayList<String>();
        AlgorithmDesign.add("Divide and Conquer");
        AlgorithmDesign.add("Dynamic Programming");
        AlgorithmDesign.add("Greedy");


        List<String> Sorting = new ArrayList<String>();
        Sorting.add("Sorting");
        Sorting.add("Bubble Sort");
        Sorting.add("Insertion Sort");
        Sorting.add("Selection Sort");
        Sorting.add("Merge Sort");
        Sorting.add("Quick Sort");

        List<String> Searching = new ArrayList<String>();
        Searching.add("Linear Search");
        Searching.add("Binary Search");

        List<String> Expressions = new ArrayList<String>();
        Expressions.add("Infix to Postfix");
        Expressions.add("Evaluation of Postfix Expression");



        List<String> Tree = new ArrayList<String>();
        Tree.add("Tree Traversals");
        Tree.add("AVL Tree");

        List<String> Graph = new ArrayList<String>();
        Graph.add("Spanning Tree");
        Graph.add("Breadth First Traversal");
        Graph.add("Depth First Traversal");
        Graph.add("Kruskal's Algorithms");
        Graph.add("Prim's Algorithm");
        Graph.add("Dijkstra's Algorithm");


        listDataChild.put(listDataHeader.get(0), Introduction); // Header, Child data
        listDataChild.put(listDataHeader.get(1), AlgorithmDesign);
        listDataChild.put(listDataHeader.get(2), Sorting);
        listDataChild.put(listDataHeader.get(3), Searching);
        listDataChild.put(listDataHeader.get(4), Expressions);
        listDataChild.put(listDataHeader.get(5), Tree);
        listDataChild.put(listDataHeader.get(6), Graph);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_2, R.anim.slide_out_2);

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