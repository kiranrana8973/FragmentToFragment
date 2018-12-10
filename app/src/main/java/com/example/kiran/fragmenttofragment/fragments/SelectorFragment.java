package com.example.kiran.fragmenttofragment.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.kiran.fragmenttofragment.IMainActivity;
import com.example.kiran.fragmenttofragment.R;

public class SelectorFragment extends Fragment implements View.OnClickListener {

    private static final String TAG = "SelectorFragment";
    private IMainActivity iMainActivity;

    private Button btnFragmentA,btnFragmentB,btnFragmentC;
    private EditText mMessage;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMainActivity = (IMainActivity) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iMainActivity.setToolbarTitle(getTag());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_selector,container,false);

        btnFragmentA = view.findViewById(R.id.btnFragmentA);
        btnFragmentB = view.findViewById(R.id.btnFragmentB);
        btnFragmentC = view.findViewById(R.id.btnFragmentC);

        mMessage = view.findViewById(R.id.mMessage);


        btnFragmentA.setOnClickListener(this);
        btnFragmentB.setOnClickListener(this);
        btnFragmentC.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnFragmentA:{
                    break;
            }

            case R.id.btnFragmentB:{
                break;
            }

            case R.id.btnFragmentC:{
            break;
        }





        }

    }
}