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
 * Time: 下午4:47
 * To change this template use File | Settings | File Templates.
 */
public class ContentListElement implements ListElement {
    private  String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_content;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isClickable() {
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public View getViewForListElement(LayoutInflater layoutInflater, Context context, View view) {
        LinearLayout layout = (LinearLayout) layoutInflater.inflate(getLayoutId(),null);
        TextView textView = (TextView) layout.findViewById(R.id.title);
        textView.setText(title);

        return layout;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
