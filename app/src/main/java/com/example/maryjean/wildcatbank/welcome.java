package com.example.maryjean.wildcatbank;

/**
 * Created by Maryjean on 4/13/2016.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hp1 on 21-01-2015.
 */
public class welcome extends Fragment {

    public contact_us.OnFragmentInteractionListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.welcome, container, false);
        return v;
    }

    @Override
    public void onAttach(Context context) {


        super.onAttach(context);
        if (context instanceof contact_us.OnFragmentInteractionListener) {
            mListener = (contact_us.OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }

    }

    public View openLogOn(View v){
        startActivity(new Intent(welcome.this, logon.class));
        return v;
    }
}