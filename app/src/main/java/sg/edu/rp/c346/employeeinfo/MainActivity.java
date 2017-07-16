package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lvEmployee);
        ArrayList<EmployeeItem>employeeItems;
        CustomAdapter caEmployee;

        employeeItems = new ArrayList<EmployeeItem>();
        caEmployee = new CustomAdapter(this,R.layout.employeeitem_row,employeeItems);

        lv.setAdapter(caEmployee);


        EmployeeItem item1 = new EmployeeItem("John","Software Technical Leader",3400.0); //Create a ToDoItem object named item1
        employeeItems.add(item1);  //Add the ToDoItem object to the toDoList ArrayList


        EmployeeItem item2 = new EmployeeItem("May","Programmer",2200.0);
        employeeItems.add(item2);

    }
}
