package com.example.maryjean.wildcatbank;

/**
 * Created by Maryjean on 4/13/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by hp1 on 21-01-2015.
 */
public class accounts extends Fragment {

    private ImageButton checkingButton;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.accounts,container,false);
        return v;

        /*checkingButton = (ImageButton) findViewById(R.id.basicCheckingIMG);
        checkingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(accounts.this, checking.class);
                startActivity(i);
            }

        });*/
    }



}