package com.example.tf_idf2.ui.home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tf_idf2.ui.home.FragFirst;
import com.example.tf_idf2.ui.home.FragFourth;
import com.example.tf_idf2.ui.home.FragSecond;
import com.example.tf_idf2.ui.home.FragThird;


public class MyAdapter extends FragmentStateAdapter {

    public int mCount;

    public MyAdapter(FragmentActivity fa, int count) {
        super(fa);
        mCount = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int index = getRealPosition(position);

        if(index==0) return new FragFirst();
        else if(index==1) return new FragSecond();
        else if(index==2) return new FragThird();
        else return new FragFourth();

    }

    @Override
    public int getItemCount() {
        return 2000;
    }

    public int getRealPosition(int position) { return position % mCount; }


}
