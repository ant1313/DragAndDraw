package com.bignerdranch.android.draganddraw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Антон on 06.04.2017.
 */

public class DragAndDrawFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_drag_and_draw, parent, false);
            return v;
        }
}
