package com.example.myfirstapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;


    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam) {

        super(context, R.layout.list_layout, nameArrayParam);

        for (int i = 0; i < nameArrayParam.length; i++) {
            if (i == 2)
                nameArrayParam[i] = "3. Julian Kranz";
            else
                nameArrayParam[i] = "" + (i + 1) + ". " + nameArrayParam[i];
        }

        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_layout, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);
        return rowView;
    }


}
