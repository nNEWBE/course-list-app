package com.example.classwork_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.List;

public class CourseAdapter extends ArrayAdapter<CourseItem> {
    
    public CourseAdapter(Context context, List<CourseItem> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_course, parent, false);
        }

        CourseItem currentItem = getItem(position);

        // Initialize views
        TextView titleText = listItemView.findViewById(R.id.titleText);
        TextView subtitleText = listItemView.findViewById(R.id.subtitleText);
        ImageButton actionButton = listItemView.findViewById(R.id.actionButton);

        // Set data to views
        if (currentItem != null) {

            titleText.setText(currentItem.getTitle());
            subtitleText.setText(currentItem.getSubtitle());

            // Set action button icon based on selection state
            actionButton.setImageResource(
                    currentItem.isSelected() ?
                            R.drawable.right:
                            R.drawable.edit
            );

            // Toggle selection on button click
            actionButton.setOnClickListener(v -> {
                currentItem.setSelected(!currentItem.isSelected());
                notifyDataSetChanged();
            });
        }

        return listItemView;
    }
}
