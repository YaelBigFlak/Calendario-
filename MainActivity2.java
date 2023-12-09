package com.example.calendario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    public class Event {
        private String title;
        private long dateMillis;

        public Event(String title, long dateMillis) {
            this.title = title;
            this.dateMillis = dateMillis;
        }

        public String getTitle() {
            return title;
        }

        public long getDateMillis() {
            return dateMillis;
        }
    }

    private EditText eventTitle;
    private CalendarView calendarView;
    private Button Button;
    private List<Event> eventList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        eventTitle = findViewById(R.id.eventTitle);
        calendarView = findViewById(R.id.calendarView);
        Button = findViewById(R.id.addEventButton);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = eventTitle.getText().toString();
                long dateMillis = calendarView.getDate();

                Event event = new Event(title, dateMillis);
                eventList.add(event);

                eventTitle.setText("");
            }
        });
    }
}