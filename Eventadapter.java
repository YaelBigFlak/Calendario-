package com.example.calendario;
import android.view.LayoutInflater;
import com.example.calendario.EventListActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.util.List;


public class Eventadapter extends RecyclerView.Adapter<Eventadapter.ViewHolder> {

    private List<Event> eventList;
    private String title;
    public String getTitle() {
        return title;
    }
    public Eventadapter(List<Event> eventList) {
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Event event = eventList.get(position);
        holder.titleTextView.setText(event.getTitle());
        // Puedes agregar más detalles del evento según sea necesario
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

        public static class ViewHolder extends RecyclerView.ViewHolder {
            TextView titleTextView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                titleTextView = itemView.findViewById(R.id.titleTextView);
            }
    }
}