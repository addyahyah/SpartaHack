package com.rosehulman.zhangl3.bucks20.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rosehulman.zhangl3.bucks20.R;

/**
 * Created by zhangl3 on 2/27/2016.
 */
public class FeedFragment extends Fragment{
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static FeedFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FeedFragment fragment = new FeedFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView textView = (TextView) view;
        textView.setText("Fragment #" + mPage);
        return view;
    }
}
