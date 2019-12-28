package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment2 extends Fragment {
View v;
Button btn3;
    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       v =  inflater.inflate(R.layout.fragment_fragment2, container, false);
       btn3 = v.findViewById(R.id.btn3);
       btn3.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view) {
               Toast.makeText(getContext(), "DRAGON", Toast.LENGTH_LONG).show();
           }
           });
       return v;
       }
    }


