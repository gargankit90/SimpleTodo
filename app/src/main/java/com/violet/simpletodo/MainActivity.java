package com.violet.simpletodo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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


        // Create adapter passing in the sample user data
        ToDoAdapter adapter = new ToDoAdapter(items);
        // Attach the adapter to the recyclerview to populate items
        recyclerView.setAdapter(adapter);
        // Set layout manager to position the items
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // That's all!


        // set a click listener on the add button to add the data entered in edit text to the list
        Button addButton = findViewById(R.id.button);
        EditText newToDoItem = findViewById(R.id.editText);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.add(newToDoItem.getText().toString());
                adapter.notifyDataSetChanged();
                newToDoItem.setText("");
            }
        });
    }
}