package com.example.franciscoandrade.fragmentspractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    View rootView;


    EditText editText_secondfragment;
    Button button_secondfragment;
    TextView textView_secondfragment;


    String text;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_second, container, false);

////
////       final CheckingInput checkingInput = new CheckingInput();
////
//////       String text = checkingInput.getEditTextString();
////
////
textView_secondfragment = (TextView)rootView.findViewById(R.id.textView_secondfragment);
//
//
        editText_secondfragment= (EditText)rootView.findViewById(R.id.editText_secondfragment);
        Bundle bundle = getArguments();

        if (bundle.getString("text") == null){

            text = "null";
        }else {
            text = bundle.getString("text");
        }



        classLoader();

        return rootView;
    }

    private void classLoader() {

        CheckingInput checkingInput = new CheckingInput(text);

        textView_secondfragment.setText(checkingInput.getEditTextString());
        //editText_secondfragment.setText();


    }



}
