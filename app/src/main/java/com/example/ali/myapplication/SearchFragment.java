package com.example.ali.myapplication;

/**
 * Created by Ali on 7/21/2017.
 */

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class SearchFragment extends Fragment {
    public SearchFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }
}
