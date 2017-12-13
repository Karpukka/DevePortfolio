package com.example.android.deveportfolio.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.android.deveportfolio.views.AboutFragment;
import com.example.android.deveportfolio.views.ContactFragment;
import com.example.android.deveportfolio.views.SkillsFragment;
import com.example.android.deveportfolio.views.WorkFragment;

/**
 * Created by Yakudza on 12/13/2017.
 */

public class DevPagerAdapter extends FragmentPagerAdapter {

  public DevPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override
  public Fragment getItem(int position) {
    switch (position){
      case 0: return new AboutFragment();
      case 1: return new WorkFragment();
      case 2:return new SkillsFragment();
      case 3: return  new ContactFragment();
    }
    return null;
  }

  @Override
  public int getCount() {
    return 4;
  }

  @Override
  public CharSequence getPageTitle(int position) {
    switch (position){
      case 0: return "ABOUT";
      case 1: return "WORK";
      case 2: return "SKILLS";
      case 3: return "CONTACT";
    }
    return null;
  }
}
