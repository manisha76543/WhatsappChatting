package com.example.chattingapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chattingapp.fragments.CallsFragment;
import com.example.chattingapp.fragments.ChatsFragment;
import com.example.chattingapp.fragments.StatusFragment;

import javax.net.ssl.SSLEngineResult;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

//    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
//        super(fm, behavior);
//    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case  0: return new ChatsFragment();
            case  1: return new StatusFragment();
            case  2: return new CallsFragment();
            default:return new ChatsFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = null;

        if(position == 0)
        {
            title = "Chats";
        }
        if(position == 1)
        {
            title = "Status";
        }
        if(position == 2)
        {
            title = "Calls";
        }
        return title;

       // return super.getPageTitle(position);
    }
}
