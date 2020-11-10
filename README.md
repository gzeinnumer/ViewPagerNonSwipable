# ViewPagerNonSwipable
 tidak bisa swipe di view pager,
 
- `ViewPagerNonSwipable.java`
```java
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
```

- `activity_main.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <com.gzeinnumer.viewpagernonswipable.helper.ViewPagerNonSwipable
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```


---

```
Copyright 2020 M. Fadli Zein
```
