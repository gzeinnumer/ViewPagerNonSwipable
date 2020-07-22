package com.gzeinnumer.viewpagernonswipable.helper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class ViewPagerNonSwipable extends ViewPager {

    private boolean swipeable;

    public ViewPagerNonSwipable(Context context) {
        super(context);
        setSwipeable(false);
    }

    public ViewPagerNonSwipable(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.swipeable = true;
        setSwipeable(false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.swipeable) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override

    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.swipeable) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    //    setSwipeable(false) -> call in activity
    public void setSwipeable(boolean swipeable) {
        this.swipeable = swipeable;
    }
}
