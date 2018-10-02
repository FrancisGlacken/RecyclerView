package com.deltorostudios.recyclerviewcodelab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;

public class RecView extends AppCompatActivity {

    private final LinkedList<String> mWordList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private String myStuff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rec_view);

        Intent myIntent = getIntent();
        myStuff = myIntent.getStringExtra("key");

        // Put initial data into the word list "mWordList"
        mWordList.addLast(myStuff);


        // Get a handle to the RecView
        mRecyclerView = findViewById((R.id.recyclerview));

        // Create an adapter and supply the data to be displayed
        mAdapter = new WordListAdapter(this, mWordList);

        // Connect the adapter with the RecView
        mRecyclerView.setAdapter(mAdapter);

        // Give the RecyclerView a default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager((this)));

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void AddToList(View view) {
        mWordList.addLast(myStuff);

        // Get a handle to the RecView
        mRecyclerView = findViewById((R.id.recyclerview));

        // Create an adapter and supply the data to be displayed
        mAdapter = new WordListAdapter(this, mWordList);

        // Connect the adapter with the RecView
        mRecyclerView.setAdapter(mAdapter);

        // Give the RecyclerView a default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager((this)));
    }
}
