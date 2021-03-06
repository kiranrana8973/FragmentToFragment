package com.example.kiran.fragmenttofragment.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

import com.example.kiran.fragmenttofragment.IMainActivity;
import com.example.kiran.fragmenttofragment.MainActivity;
import com.example.kiran.fragmenttofragment.R;

import java.util.zip.Inflater;

public class AFragment extends Fragment {

    private static final String TAG = "AFragment";
    IMainActivity iMainActivity;
    private TextView mIncomingMessage;
    private String message;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        iMainActivity = (MainActivity) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iMainActivity.setToolbarTitle(getTag());

        Bundle bundle = this.getArguments();
        if(bundle!= null)
        {
            message = bundle.getString(getString(R.string.intent_message));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        mIncomingMessage = view.findViewById(R.id.incoming_messageA);

        return view;
    }
}
