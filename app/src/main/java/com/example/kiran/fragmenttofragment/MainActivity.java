package com.example.kiran.fragmenttofragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kiran.fragmenttofragment.fragments.SelectorFragment;

public class MainActivity extends AppCompatActivity implements IMainActivity{


    private static final String TAG = "MainActivity";

    private TextView toolbarTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbarTitle = findViewById(R.id.toollbar_title);

        init();
    }


    private void init()
    {
        SelectorFragment fragment = new SelectorFragment();
        doFragmentTransaction(fragment,getString(R.string.fragment_selector),false,"");
    }
    private void doFragmentTransaction(Fragment fragment,String tag,boolean addToBackStack,String message )
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_container,fragment,tag);

        if(addToBackStack)
            transaction.addToBackStack(tag);

        transaction.commit();

    }

    @Override
    public void setToolbarTitle(String fragmentTag) {
        toolbarTitle.setText(fragmentTag);
    }
}
