package com.example.classwork_05;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Load animations
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        Animation slideLeft = AnimationUtils.loadAnimation(this, R.anim.slide_left);
        Animation slideDown = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        Animation slideRight = AnimationUtils.loadAnimation(this, R.anim.slide_right);

        // Get views
        MaterialTextView titleText = findViewById(R.id.text_title);
        ImageView mainImage = findViewById(R.id.main_image);
        TextView welcomeText = findViewById(R.id.text_welcome_title);
        TextView descriptionText = findViewById(R.id.text_description);
        TextView getStartedButton = findViewById(R.id.button_get_started);
        ImageView sideIcon1 = findViewById(R.id.side_icon_1);
        ImageView sideIcon2 = findViewById(R.id.side_icon_2);
        ImageView sideIcon3 = findViewById(R.id.side_icon_3);
        ImageView sideIcon4 = findViewById(R.id.side_icon_4);

        // Apply animations
        if (titleText != null) {
            titleText.startAnimation(slideDown);
        }
        if (sideIcon1 != null) {
            sideIcon1.startAnimation(slideRight);
        }
        if (sideIcon2 != null) {
            sideIcon2.startAnimation(slideLeft);
        }
        if (sideIcon3 != null) {
            sideIcon3.startAnimation(slideRight);
        }
        if (sideIcon4 != null) {
            sideIcon4.startAnimation(slideLeft);
        }
        if (mainImage != null) {
            mainImage.startAnimation(fadeIn);
        }
        if (welcomeText != null) {
            welcomeText.startAnimation(slideUp);
        }
        if (descriptionText != null) {
            descriptionText.startAnimation(slideUp);
        }
        if (getStartedButton != null) {
            getStartedButton.startAnimation(slideLeft);
        }

        getStartedButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CourseActivity.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}