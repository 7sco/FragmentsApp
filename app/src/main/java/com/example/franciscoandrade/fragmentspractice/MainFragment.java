package com.example.franciscoandrade.fragmentspractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainFragment extends Fragment {

    private View rootView;
    TextView textFragment;
    Button buttonFragment;
    EditText editTextFragment;




    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView=inflater.inflate(R.layout.fragment_main, container, false);

        textFragment = (TextView) rootView.findViewById(R.id.textFragment);
        buttonFragment =(Button) rootView.findViewById(R.id.buttonFragment);
        editTextFragment= (EditText) rootView.findViewById(R.id.editTextFragment);

        return rootView;
    }

}
