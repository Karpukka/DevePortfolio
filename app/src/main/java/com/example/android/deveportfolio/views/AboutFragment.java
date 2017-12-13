package com.example.android.deveportfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import com.example.android.deveportfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


  public AboutFragment() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View aboutView =inflater.inflate(R.layout.fragment_about, container, false);
   
    return aboutView;
  }

}
