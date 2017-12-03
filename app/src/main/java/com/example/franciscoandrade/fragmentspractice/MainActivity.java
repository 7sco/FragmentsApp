package com.example.franciscoandrade.fragmentspractice;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    MainFragment mainFragment =  new MainFragment();

    FragmentManager fragmentManager = getSupportFragmentManager();


    SecondFragment secondFragment = new SecondFragment();


    boolean check =  true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {



       // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        if( fragmentManager.findFragmentByTag("mainFragment") == null || !check){
            fragmentManager.beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.fragmentFrameLayout, mainFragment,"mainFragment")
                    .addToBackStack(null)
                    .commit();


//            t =editTextFragment.getText().toString();



            check=true;
        }
        else if(fragmentManager.findFragmentByTag("fragment2") == null || check){
//            fragmentManager.beginTransaction()
//                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
//                    .replace(R.id.fragmentFrameLayout, secondFragment)
//                    .addToBackStack(null)
//                    .commit();


            Bundle bundle = new Bundle();
            bundle.putString("text", "");

            secondFragment = new SecondFragment();
            secondFragment.setArguments(bundle);
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                    .replace(R.id.fragmentFrameLayout, secondFragment, "fragment2")
                    .addToBackStack(null)
                    .commit();

            check=false;
        }


    }


}
