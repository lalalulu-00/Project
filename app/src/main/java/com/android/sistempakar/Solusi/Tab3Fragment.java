package com.android.sistempakar.Solusi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.android.sistempakar.Nullable;
import com.android.sistempakar.R;

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment,container,false);

        return view;
    }
}
