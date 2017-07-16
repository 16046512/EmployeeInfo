package sg.edu.rp.c346.employeeinfo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<EmployeeItem>employeeItems;

    public CustomAdapter(Context context, int resouce, ArrayList<EmployeeItem>objects){
        super(context,resouce,objects);

        parent_context=context;
        layout_id=resouce;
        employeeItems=objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInfalter object
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI Elements and assign to variables
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        TextView tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        TextView tvSalary = (TextView) rowView.findViewById(R.id.tvSalary);

        // Obtain the to-do item based on the 'position'.
        EmployeeItem currentItem = employeeItems.get(position);

        // Set the TextView to display corresponding information
        tvName.setText(currentItem.getName());
        tvTitle.setText(currentItem.getTitle());
        String salary = Double.toString(currentItem.getSalary());
        tvSalary.setText(salary);


        //return the View corresponding to the data at the specified position.
        return rowView;
    }


}
