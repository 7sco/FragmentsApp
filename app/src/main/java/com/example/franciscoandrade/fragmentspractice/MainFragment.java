package com.example.franciscoandrade.fragmentspractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;


import android.support.v4.app.FragmentManager;
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
    SecondFragment secondFragment;
    FragmentManager fragmentManager;
    String t="";

    //MainFragment mainFragment =  new MainFragment();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        textFragment = (TextView) rootView.findViewById(R.id.textFragment);
        buttonFragment = (Button) rootView.findViewById(R.id.buttonFragment);
        editTextFragment = (EditText) rootView.findViewById(R.id.editTextFragment);







        buttonFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t =editTextFragment.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("text", t);

                secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                        .replace(R.id.fragmentFrameLayout, secondFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });


        return rootView;
    }

}
