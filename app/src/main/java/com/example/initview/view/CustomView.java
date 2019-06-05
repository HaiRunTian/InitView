package com.example.initview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Scroller;

/**
 * @author HaiRun
 * @time 2019/5/28.15:18
 */
public class CustomView extends View {
    int lastX;
    int lastY;
    Scroller m_scroller;
    public CustomView(Context context) {
        super(context);
        m_scroller = new Scroller(context);

    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                lastX = x;
                lastY = y;
                break;

            case MotionEvent.ACTION_MOVE:
                //计算移动的距离
                int offsetX = x - lastX;
                int offsetY = y - lastY;
                //调用layout方法来重新放置它的位置
//                layout(getLeft() + offsetX, getTop() + offsetY,
//                        getRight() + offsetX, getBottom() + offsetY);

//                offsetLeftAndRight(offsetX);
//                offsetTopAndBottom(offsetY);

                LinearLayout.LayoutParams _layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                _layoutParams.leftMargin = getLeft() + offsetX;
                _layoutParams.rightMargin = getTop() + offsetY;
                setLayoutParams(_layoutParams);
                break;
                default:break;
        }

        return true;
    }

    @Override
    public void computeScroll() {
        super.computeScroll();
        if (m_scroller.computeScrollOffset()){
            ((View)getParent()).scrollTo(m_scroller.getCurrX(),m_scroller.getCurrY());
            invalidate();
        }
    }

    public void smoothScrollTo(int destS,int destY){
        int scrollX = getScrollX();
        int delta = destY - scrollX;
        m_scroller.startScroll(scrollX,0,delta,2000);
        invalidate();
    }
}
