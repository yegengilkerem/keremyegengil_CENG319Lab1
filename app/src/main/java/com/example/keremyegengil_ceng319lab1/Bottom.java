package com.example.keremyegengil_ceng319lab1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Bottom extends Fragment {
    TextView status;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom, container, false);
            status = (TextView) view.findViewById(R.id.status);
            status.setText(getString(R.string.tag) + getString(R.string.create));
            Log.d(getString(R.string.d_tag), getString(R.string.create));
            //Creating Toast to show when onCreate Activity is executed
            Toast toast = Toast.makeText(getActivity().getApplicationContext(), getString(R.string.create), Toast.LENGTH_LONG);
            toast.show();

            return view;


        }

        //Life Cycles - Displaying message according which activity is executed
        public void onStart()
        {
            super.onStart();
            status.setText(getString(R.string.tag)+getString(R.string.start));
            Log.d(getString(R.string.d_tag), getString(R.string.start));
            Toast toast = Toast.makeText(getActivity().getApplicationContext(),getString(R.string.start),Toast.LENGTH_LONG);
            toast.show();
        }
        public void onStop()
        {
            super.onStop();
            status.setText(getString(R.string.tag)+getString(R.string.stop));
            Log.d(getString(R.string.d_tag), getString(R.string.stop));
        }

        public void onDestroy()
        {
            super.onDestroy();
            status.setText(getString(R.string.tag)+getString(R.string.destroy));
            Log.d(getString(R.string.d_tag), getString(R.string.destroy));
        }


}
