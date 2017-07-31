package com.example.dineshvarma.areaconverter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] codes={"km"+ '\u00b2', "m"+ '\u00b2', "mi"+ '\u00b2', "yd"+ '\u00b2',"ft"+ '\u00b2', "in"+ '\u00b2', "ha", "ac"};
    String[] names={"Square kilometre km"+ '\u00b2',"Square metre m"+ '\u00b2', "Square mile m"+ '\u00b2', "Square yard yd"+ '\u00b2',
    "Square foot ft"+ '\u00b2', "Square inch in"+ '\u00b2', "Hectare ha", "Acre ac"};
     CustomAdapter(Context c){
        context = c;
    }
    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView txt = new TextView(context);
        txt.setTextSize(24);
        txt.setText(codes[i]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView txt = new TextView(context);
        txt.setPadding(16, 16, 16, 16);
        txt.setTextSize(28);
        txt.setText(names[position]);
        txt.setTextColor(Color.parseColor("#000000"));
        return  txt;
    }
}
