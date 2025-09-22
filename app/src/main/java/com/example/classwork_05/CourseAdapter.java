package com.example.classwork_05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CourseAdapter extends ArrayAdapter<CourseItem> {
    // No need for a separate 'items' list here; ArrayAdapter manages its own.

    public CourseAdapter(Context context, List<CourseItem> items) {
        // The third argument (items) initializes ArrayAdapter's internal list.
        super(context, 0, items);
    }

    public void updateList(List<CourseItem> newItems) {
        // Use ArrayAdapter's methods to modify its internal list.
        // These methods will also handle calling notifyDataSetChanged().
        super.clear();
        if (newItems != null) {
            super.addAll(newItems);
        }
        // No explicit notifyDataSetChanged() needed here, as super.addAll() handles it.
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_course, parent, false);
        }
        
        // Load the animation
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.item_animation);
        // Set start offset for staggered animation (500ms delay between items)
        animation.setStartOffset(position * 150);
        listItemView.startAnimation(animation);

        // Get the data item for this position using ArrayAdapter's getItem method.
        CourseItem currentItem = getItem(position);

        if (currentItem != null) {
            // Initialize views
            TextView titleText = listItemView.findViewById(R.id.titleText);
            TextView subtitleText = listItemView.findViewById(R.id.subtitleText);
            ImageButton actionButton = listItemView.findViewById(R.id.actionButton);

            // Set data to views
            titleText.setText(currentItem.getTitle());
            subtitleText.setText(currentItem.getSubtitle());

            // Set action button icon based on selection state
            actionButton.setImageResource(
                    currentItem.isSelected() ?
                            R.drawable.edit :
                            R.drawable.right
            );

            // Toggle selection on button click
            actionButton.setOnClickListener(v -> {
                currentItem.setSelected(!currentItem.isSelected());
                // This call is fine for updating the item's visual state.
                notifyDataSetChanged();
            });
        }
        return listItemView;
    }
}