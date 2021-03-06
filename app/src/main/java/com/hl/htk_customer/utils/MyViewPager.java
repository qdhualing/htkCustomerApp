package com.hl.htk_customer.utils;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 作者 龙威陶
 * 说明
 * 创建时间 2016/2/17.
 * 版本  1
 * 公司名称 百迅科技  www.bxv8.com baixukeji@163.com
 */
public class MyViewPager extends ViewPager {
      private boolean isCanScroll = false;

      public MyViewPager(Context context) {
            super(context);
      }

      public MyViewPager(Context context, AttributeSet attrs) {
            super(context, attrs);
      }

      public void setScanScroll(boolean isCanScroll) {
            this.isCanScroll = isCanScroll;
      }

      @Override
      public void scrollTo(int x, int y) {
            super.scrollTo(x, y);
      }

      @Override
      public boolean onTouchEvent(MotionEvent arg0) {
            // TODO Auto-generated method stub
            if (isCanScroll) {
                  return super.onTouchEvent(arg0);
            } else {
                  return false;
            }

      }


      @Override
      public boolean onInterceptTouchEvent(MotionEvent arg0) {
            // TODO Auto-generated method stub
            if (isCanScroll) {
                  return super.onInterceptTouchEvent(arg0);
            } else {
                  return false;
            }

      }

      @Override
      public void setCurrentItem(int item, boolean smoothScroll) {
            // TODO Auto-generated method stub
            super.setCurrentItem(item, smoothScroll);
      }

      @Override
      public void setCurrentItem(int item) {
            // TODO Auto-generated method stub
            super.setCurrentItem(item, false);
      }
}
