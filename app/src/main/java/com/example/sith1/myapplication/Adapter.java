package com.example.sith1.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SITH1 on 28-Oct-17.
 */

public class Adapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Model> mList;
    private static final String TAG = "Adapter";

    public Adapter(Context context, ArrayList<Model> list) {

        this.mContext = context;
        this.mList = list;
        Log.d(TAG, "inside constructor List SIze :  " + mList.size() );
    }


    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Log.d(TAG, "insdie getView() : " + i);
        ViewHolder viewHolder;
        if (view == null) {

            view = LayoutInflater.from(mContext).inflate(R.layout.list_item, viewGroup, false);

            viewHolder = new ViewHolder();

            viewHolder.name = view.findViewById(R.id.tv_name);
            viewHolder.age = view.findViewById(R.id.tv_age);
            viewHolder.selected = view.findViewById(R.id.cb_selected);

            view.setTag(viewHolder);

        } else {

            viewHolder = (ViewHolder) view.getTag();
        }

        Model ma = (Model) getItem(i);
        viewHolder.name.setText(ma.getName().toString());
        viewHolder.age.setText(String.valueOf(ma.getAge()));
        viewHolder.selected.setChecked(ma.isSelected());

        return view;
    }

    class ViewHolder {

        private TextView name;
        private TextView age;
        private CheckBox selected;
    }
}
