package com.deltorostudios.recyclerviewcodelab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private String myStuff = "Wallet";
    private EditText myEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = findViewById(R.id.enterStuffView);




    }

    public void ToRecViewButton(View view) {

        myStuff = myEditText.getText().toString();

        Intent myIntent = new Intent( this, RecView.class);
        myIntent.putExtra("key", myStuff);
        startActivity(myIntent);
    }


}
