package com.example.olgacoll.sifu;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by olgacoll on 11/5/17.
 */

public class InfoFragment extends Fragment {

    public static final String TAG = "InfoFragment";

    public InfoFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_info, container, false);

        return view;
    }
}