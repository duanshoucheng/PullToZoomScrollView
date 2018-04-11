package com.darren.zoomview.library;

import android.view.animation.Interpolator;

/**
 * Created by darren on 2018/4/9.
 */

public class DefaultInterpolator implements Interpolator {
    @Override
    public float getInterpolation(float input) {
        float f = input - 1.0f;
        return 1.0F + f * (f * (f * (f * f)));
    }
}
