package com.example.keremyegengil_ceng319lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.ListFragment;

public class Top extends ListFragment  {
    //Declaring two buttons for upper fragment


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top,container,false);
        String[] activities = new String[] {
                "AiActivity",
                "VrActivity"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,activities);
        setListAdapter(adapter);

//        ListView lv = (ListView) view.findViewById(R.id.listv);
//        lv.setAdapter(adapter);
//        lv.setOnItemClickListener(this);
        //Toast
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),getString(R.string.create),Toast.LENGTH_LONG);
        toast.show();

        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Auto-genereated method stub
        super.onListItemClick(l,v,position,id);

        //Making case switch buttons in list view
//        if(position==0){
//            Intent a = new Intent(getActivity(),AiActivity.class);
//            startActivity(a);
//        }
//        if(position==1){
//            Intent a = new Intent(getActivity(),AiActivity.class);
//             startActivity(a);
//        }
        switch (position){
            case 0:
              Intent a = new Intent(getActivity(),AiActivity.class);

                startActivity(a);
                break;
            case 1:
                Intent b = new Intent(getActivity(),VrActivity.class);
                startActivity(b);
                break;
            default:
                break;
        }
    }

    //Excecuting toast statement on the activation  of onStart Function
    public void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(getActivity().getApplicationContext(),getString(R.string.start),Toast.LENGTH_LONG);
        toast.show();
    }

//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//        switch (position){
//            case 0:
//                Intent a = new Intent(getActivity(),AiActivity.class);
//                startActivity(a);
//                break;
//            case 1:
//                Intent b = new Intent(getActivity(),VrActivity.class);
//                startActivity(b);
//                break;
//            default:
//                break;
//        }
//    }
}
