package com.example.keremyegengil_ceng319lab1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VrActivity extends AppCompatActivity {
    TextView text;

    // Decalaring Life Cycle in VrActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vr_activity);
        text= (TextView)findViewById(R.id.activity);
        text.setText(getString(R.string.vr_tag)+getString(R.string.create));
    }
    public void onStart()
    {
        super.onStart();
        text.setText(getString(R.string.vr_tag)+getString(R.string.start));
        Log.d(getString(R.string.vr_tag), getString(R.string.start));
    }

    public void onStop()
    {
        super.onStop();
        text.setText(getString(R.string.vr_tag)+getString(R.string.stop));
        Log.d(getString(R.string.vr_tag), getString(R.string.stop));
    }

    public void onDestroy()
    {
        super.onDestroy();
        text.setText(getString(R.string.vr_tag)+getString(R.string.destroy));
        Log.d(getString(R.string.vr_tag), getString(R.string.destroy));
    }
}
