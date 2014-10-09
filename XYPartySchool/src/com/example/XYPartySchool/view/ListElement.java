package com.example.XYPartySchool.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-8-27
 * Time: 下午4:40
 * To change this template use File | Settings | File Templates.
 */
public interface ListElement {
    public int getLayoutId();         //返回布局的值

    public boolean isClickable();       //返回是否可以点击

    public View getViewForListElement(LayoutInflater layoutInflater,
                                      Context context, View view);     //返回试图对象


}
