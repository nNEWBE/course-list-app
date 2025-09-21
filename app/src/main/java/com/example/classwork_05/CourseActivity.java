package com.example.classwork_05;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import java.util.ArrayList;
import java.util.List;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Make activity full screen
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat controller = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        controller.hide(WindowInsetsCompat.Type.systemBars());
        controller.setSystemBarsBehavior(WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);

        setContentView(R.layout.activity_course);

        // Initialize ListView
        ListView courseListView = findViewById(R.id.courseListView);
        
        // Create sample data
        List<CourseItem> courseItems = new ArrayList<>();


        // Semester 1
        courseItems.add(new CourseItem("Bengali", "BAN-1108"));
        courseItems.add(new CourseItem("Introduction to Computer System", "CSE-1101"));
        courseItems.add(new CourseItem("Structured Programming Language", "CSE-1102"));
        courseItems.add(new CourseItem("Structured Programming Language Lab", "CSE-1103L"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-1109"));
        courseItems.add(new CourseItem("English Reading Skills & Public Speaking", "ENG-1107"));
        courseItems.add(new CourseItem("Environmental Science", "ENV-1106"));
        courseItems.add(new CourseItem("Math-I (Calculus)", "MAT-1104"));
        courseItems.add(new CourseItem("Physics (Electricity, Magnetism & Optics)", "PHY-1105"));

        // Semester 2
        courseItems.add(new CourseItem("Object Oriented Programming Language (C++)", "CSE-1201"));
        courseItems.add(new CourseItem("Object Oriented Programming Language (C++) Lab", "CSE-1202L"));
        courseItems.add(new CourseItem("Engineering Drawing and CAD Lab", "CSE-1205L"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-1209"));
        courseItems.add(new CourseItem("Electrical & Electronics Circuits", "EEE-1203"));
        courseItems.add(new CourseItem("Electrical & Electronics Circuits Lab", "EEE-1204L"));
        courseItems.add(new CourseItem("English Writing Skills and Communications", "ENG-1208"));
        courseItems.add(new CourseItem("Discrete Mathematics", "MAT-1206"));
        courseItems.add(new CourseItem("Math-II (Co-ordinate Geometry & Vector Analysis)", "MAT-1207"));

        // Semester 3
        courseItems.add(new CourseItem("Data Structures", "CSE-2301"));
        courseItems.add(new CourseItem("Data Structures Lab", "CSE-2302L"));
        courseItems.add(new CourseItem("Digital Logic & System Design", "CSE-2303"));
        courseItems.add(new CourseItem("Digital Logic & System Design Lab", "CSE-2304L"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-2309"));
        courseItems.add(new CourseItem("Industrial Economics", "ECO-2307"));
        courseItems.add(new CourseItem("Math-III (Differential Equation & Special Function)", "MAT-2306"));
        courseItems.add(new CourseItem("Liberation War of Bangladesh", "PG-2308"));
        courseItems.add(new CourseItem("Statistics & Probability", "STA-2305"));

        // Semester 4
        courseItems.add(new CourseItem("Introduction to Management & Marketing", "BBA-2408"));
        courseItems.add(new CourseItem("Algorithm", "CSE-2401"));
        courseItems.add(new CourseItem("Algorithm Lab", "CSE-2402L"));
        courseItems.add(new CourseItem("Microprocessors & Microcontrollers", "CSE-2403"));
        courseItems.add(new CourseItem("Microcontrollers & Assembly Language Lab", "CSE-2404L"));
        courseItems.add(new CourseItem("Java Programming Language Lab", "CSE-2405L"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-2409"));
        courseItems.add(new CourseItem("Numerical Methods", "MAT-2406"));
        courseItems.add(new CourseItem("Math-IV (Matrix & Complex Analysis)", "MAT-2407"));

        // Semester 5
        courseItems.add(new CourseItem("Financial & Managerial Accounting", "BBA-3508"));
        courseItems.add(new CourseItem("Database Management Systems", "CSE-3501"));
        courseItems.add(new CourseItem("Database Management Systems Lab", "CSE-3502L"));
        courseItems.add(new CourseItem("Computer Graphics & Animation", "CSE-3503"));
        courseItems.add(new CourseItem("Computer Graphics & Animation Lab", "CSE-3504L"));
        courseItems.add(new CourseItem("Communication Engineering", "CSE-3505"));
        courseItems.add(new CourseItem("Technical Writing & Presentation", "CSE-3506"));
        courseItems.add(new CourseItem("Computer Peripherals and Interfacing", "CSE-3507"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-3509"));

        // Semester 6
        courseItems.add(new CourseItem("Operating System", "CSE-3601"));
        courseItems.add(new CourseItem("Operating System Lab", "CSE-3602L"));
        courseItems.add(new CourseItem("Computer Networks & Cyber Security", "CSE-3603"));
        courseItems.add(new CourseItem("Computer Networks & Cyber Security Lab", "CSE-3604L"));
        courseItems.add(new CourseItem("Computer Architecture", "CSE-3605"));
        courseItems.add(new CourseItem("Simulation and Modeling", "CSE-3606"));
        courseItems.add(new CourseItem("Computer Ethics and Cyber Law", "CSE-3607"));
        courseItems.add(new CourseItem("Mobile Application Lab", "CSE-3608L"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-3609"));

        // Semester 7 (not given in image, placeholder)
        courseItems.add(new CourseItem("Software Engineering", "CSE-4701"));
        courseItems.add(new CourseItem("Software Engineering Lab", "CSE-4702L"));
        courseItems.add(new CourseItem("Artificial Intelligence", "CSE-4703"));
        courseItems.add(new CourseItem("Artificial Intelligence Lab", "CSE-4704L"));
        courseItems.add(new CourseItem("Compiler Design", "CSE-4705"));
        courseItems.add(new CourseItem("Compiler Design Lab", "CSE-4706L"));
        courseItems.add(new CourseItem("Research Methodology", "CSE-4707"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-4709"));

        // Semester 8 (not given in image, placeholder)
        courseItems.add(new CourseItem("Machine Learning", "CSE-4801"));
        courseItems.add(new CourseItem("Machine Learning Lab", "CSE-4802L"));
        courseItems.add(new CourseItem("Data Mining", "CSE-4803"));
        courseItems.add(new CourseItem("Data Mining Lab", "CSE-4804L"));
        courseItems.add(new CourseItem("Final Year Project/Thesis", "CSE-4805"));
        courseItems.add(new CourseItem("Entrepreneurship & Innovation", "CSE-4806"));
        courseItems.add(new CourseItem("Viva Voce", "CSE-4809"));

        // Create and set adapter
        CourseAdapter adapter = new CourseAdapter(this, courseItems);
        courseListView.setAdapter(adapter);
    }
}