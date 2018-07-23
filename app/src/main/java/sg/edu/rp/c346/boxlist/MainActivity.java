package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<boxItem> alBoxItem;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvBox = findViewById(R.id.listViewBox);

        alBoxItem = new ArrayList<>();

        boxItem box1 = new boxItem(true, false, false);
        boxItem box2 = new boxItem(false, true, false);
        boxItem box3 = new boxItem(false, false, true);

        alBoxItem.add(box1);
        alBoxItem.add(box2);
        alBoxItem.add(box3);

        caBox = new CustomAdapter(this, R.layout.box_layout, alBoxItem);

        lvBox.setAdapter(caBox);
    }
}
