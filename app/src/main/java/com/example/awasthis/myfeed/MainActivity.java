package com.example.awasthis.myfeed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

        ArrayList<ListItem> list= new ArrayList<ListItem>();

        for (int i = 1; i <= 10; i++) {
            ListItem listItem = new ListItem(
                    "Heading " + (i + 1), "tell them winter came for this House and if you leave one wolf,the sheeps are never safe!.");
            list.add(listItem);
        }
        // specify an adapter (see also next example)
        MyAdapter adapter = new MyAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
    }

