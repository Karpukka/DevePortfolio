package com.example.android.deveportfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.deveportfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkFragment extends Fragment {


  public WorkFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View workView =inflater.inflate(R.layout.fragment_work, container, false);
    return workView;
  }

}