package com.example.XYPartySchool.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.XYPartySchool.R;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-8-27
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 */
public class SectionListElement implements ListElement {
    private String text;

    public void setText(String text) {
        this.text = text;
    }
    @Override
    public int getLayoutId() {
        return R.layout.item_title;

       // return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isClickable() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public View getViewForListElement(LayoutInflater layoutInflater, Context context, View view) {
        LinearLayout layout = (LinearLayout) layoutInflater.inflate(getLayoutId(),null);
        TextView textView = (TextView) layout.findViewById(R.id.section_title);
        textView.setText(text);
        return layout; //To change body of implemented methods use File | Settings | File Templates.
    }
}
