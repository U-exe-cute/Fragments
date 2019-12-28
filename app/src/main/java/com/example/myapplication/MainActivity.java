package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 =(Button) findViewById(R.id.btn1);
        Button btn2 =(Button) findViewById(R.id.btn2);
      //  btn1.setOnClickListener(new View.setOncli){

       // }

    }
    public void onClick(View v){
        if(v.getId() == R.id.btn1){
            showFragment(new fragment1());
        }
        else {
            showFragment(new fragment2());
        }
        }

    private void showFragment(Fragment f){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.asd, f);
        ft.commit();
    }
}
