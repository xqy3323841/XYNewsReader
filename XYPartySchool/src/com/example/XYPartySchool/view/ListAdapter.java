package com.example.XYPartySchool.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-8-27
 * Time: 下午4:50
 * To change this template use File | Settings | File Templates.
 */
public class ListAdapter extends BaseAdapter {
    private Context context;

    protected ArrayList<ListElement> resultList;

    private LayoutInflater layoutInflater;

    public ListAdapter(Context context) {
        super();
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        this.resultList = new ArrayList<ListElement>();
    }


    @Override
    public int getCount() {
        return this.resultList.size();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object getItem(int position) {
        return this.resultList.get(position); //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getItemId(int position) {
        return position;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return this.resultList.get(position).getViewForListElement( layoutInflater, context, convertView);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void addList(List<ListElement> elements) {
        this.resultList.addAll(elements);
    }

    @Override
    public boolean isEnabled(int position) {
      return this.resultList.get(position).isClickable();
        //To change body of overridden methods use File | Settings | File Templates.
    }
    public void addSectionHeaderItem(String text) {
        SectionListElement element = new SectionListElement();

        element.setText(text);
        this.resultList.add(element);
    }

}
