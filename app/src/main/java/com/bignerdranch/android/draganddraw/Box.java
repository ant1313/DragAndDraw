package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by Антон on 06.04.2017.
 * для хранения данных, определяющих прямоугольник
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;
    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }
    public void setCurrent(PointF current) {
        mCurrent = current;
    }
    public PointF getOrigin() {
        return mOrigin;
    }
    public PointF getCurrent() {
        return mCurrent;
    }

}
