package com.example.keremyegengil_ceng319lab1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AiActivity extends AppCompatActivity {

    //Declaring TextView variable
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ai_activity);
        text= (TextView)findViewById(R.id.activity);
        //Setting text in the TextView
        text.setText(getString(R.string.ai_tag)+"onCreate executed");
    }

    //Life Cycles for AiActvity Class
    public void onStart()
    {
        super.onStart();
        text.setText(getString(R.string.ai_tag)+"onStart executed");
        Log.d(getString(R.string.ai_tag), "onStart executed");
    }

    public void onStop()
    {
        super.onStop();
        text.setText(getString(R.string.ai_tag)+"onStop executed");
        Log.d(getString(R.string.ai_tag), "onStop executed");
    }

    public void onDestroy()
    {
        super.onDestroy();
        text.setText(getString(R.string.ai_tag)+"onDestroy executed");
        Log.d(getString(R.string.ai_tag), "onDestroy executed");
    }

}
