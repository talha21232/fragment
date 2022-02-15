package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class firstfragment extends Fragment {

    View fragment1view;
    ListView listview;

    String[] country_name=new String[]{"pakistan","india","england","australia","canada"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragment1view= inflater.inflate(R.layout.fragment_firstfragment, container, false);
        listview=fragment1view.findViewById(R.id.listview);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.activity_list_item,country_name);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                secondFragment second=(secondFragment)getFragmentManager().findFragmentById(R.id.fragment2);
                second.setmethod("country_name"+country_name[i]);
                listview.setSelector(android.R.color.holo_blue_dark);
            }
        });
        return fragment1view;
    }
}