package com.example.kiran.fragmenttofragment.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.kiran.fragmenttofragment.IMainActivity;
import com.example.kiran.fragmenttofragment.MainActivity;
import com.example.kiran.fragmenttofragment.R;

public class BFragment extends Fragment {
    IMainActivity iMainActivity;
    private static final String TAG = "BFragment";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMainActivity = (MainActivity) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iMainActivity.setToolbarTitle(getTag());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }
}