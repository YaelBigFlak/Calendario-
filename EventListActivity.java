package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.ArrayList;


public class EventListActivity extends AppCompatActivity {
    private List<Event> eventList = new ArrayList<>();
    private Eventadapter eventAdapter;
    private RecyclerView recyclerViewEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        recyclerViewEvents = findViewById(R.id.recyclerViewEvents);
        eventList = getIntent().getParcelableArrayListExtra("eventList");

        // Configurar el RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewEvents.setLayoutManager(layoutManager);

        Eventadapter eventAdapter = new Eventadapter(eventList);
        recyclerViewEvents.setAdapter(eventAdapter);
    }
}
