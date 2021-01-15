package com.violet.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add id in layout for recycler view
        // Lookup the recyclerview in activity layout
        RecyclerView recyclerView = findViewById(R.id.toDoRecyclerView);

        // Add Dummy data
        items.add("First Item");
        items.add("Second Item");

        // Create adapter passing in the sample user data
        ToDoAdapter adapter = new ToDoAdapter(items);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        // Set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // That's all!
    }
}