package com.example.classwork_05;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

import java.util.ArrayList;
import java.util.List;

public class CourseActivity extends AppCompatActivity {
    private List<CourseItem> allCourses = new ArrayList<>();
    private CourseAdapter adapter;
    private int currentSemester = 1;
    private TextView semesterTitleTextView; // Default to 1st semester

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
        
        // Initialize the semester title TextView
        semesterTitleTextView = findViewById(R.id.semester_title);

        // Initialize Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize ListView
        ListView courseListView = findViewById(R.id.courseListView);

        // Create sample data with semester information
        // Semester 1
        allCourses.add(new CourseItem("Bengali", "BAN-1108", 1));
        allCourses.add(new CourseItem("Introduction to Computer System", "CSE-1101", 1));
        allCourses.add(new CourseItem("Structured Programming Language", "CSE-1102", 1));
        allCourses.add(new CourseItem("Structured Programming Language Lab", "CSE-1103L", 1));
        allCourses.add(new CourseItem("Viva Voce", "CSE-1109", 1));
        allCourses.add(new CourseItem("English Reading Skills & Public Speaking", "ENG-1107", 1));
        allCourses.add(new CourseItem("Environmental Science", "ENV-1106", 1));
        allCourses.add(new CourseItem("Math-I (Calculus)", "MAT-1104", 1));
        allCourses.add(new CourseItem("Physics (Electricity, Magnetism & Optics)", "PHY-1105", 1));

        // Semester 2
        allCourses.add(new CourseItem("Object Oriented Programming Language (C++)", "CSE-1201", 2));
        allCourses.add(new CourseItem("Object Oriented Programming Language (C++) Lab", "CSE-1202L", 2));
        allCourses.add(new CourseItem("Engineering Drawing and CAD Lab", "CSE-1205L", 2));
        allCourses.add(new CourseItem("Viva Voce", "CSE-1209", 2));
        allCourses.add(new CourseItem("Electrical & Electronics Circuits", "EEE-1203", 2));
        allCourses.add(new CourseItem("Electrical & Electronics Circuits Lab", "EEE-1204L", 2));
        allCourses.add(new CourseItem("English Writing Skills and Communications", "ENG-1208", 2));
        allCourses.add(new CourseItem("Discrete Mathematics", "MAT-1206", 2));
        allCourses.add(new CourseItem("Math-II (Co-ordinate Geometry & Vector Analysis)", "MAT-1207", 2));

        // Semester 3
        allCourses.add(new CourseItem("Data Structures", "CSE-2301", 3));
        allCourses.add(new CourseItem("Data Structures Lab", "CSE-2302L", 3));
        allCourses.add(new CourseItem("Digital Logic & System Design", "CSE-2303", 3));
        allCourses.add(new CourseItem("Digital Logic & System Design Lab", "CSE-2304L", 3));
        allCourses.add(new CourseItem("Viva Voce", "CSE-2309", 3));
        allCourses.add(new CourseItem("Industrial Economics", "ECO-2307", 3));
        allCourses.add(new CourseItem("Math-III (Differential Equation & Special Function)", "MAT-2306", 3));
        allCourses.add(new CourseItem("Liberation War of Bangladesh", "PG-2308", 3));
        allCourses.add(new CourseItem("Statistics & Probability", "STA-2305", 3));

        // Semester 4
        allCourses.add(new CourseItem("Introduction to Management & Marketing", "BBA-2408", 4));
        allCourses.add(new CourseItem("Algorithm", "CSE-2401", 4));
        allCourses.add(new CourseItem("Algorithm Lab", "CSE-2402L", 4));
        allCourses.add(new CourseItem("Microprocessors & Microcontrollers", "CSE-2403", 4));
        allCourses.add(new CourseItem("Microcontrollers & Assembly Language Lab", "CSE-2404L", 4));
        allCourses.add(new CourseItem("Java Programming Language Lab", "CSE-2405L", 4));
        allCourses.add(new CourseItem("Viva Voce", "CSE-2409", 4));
        allCourses.add(new CourseItem("Numerical Methods", "MAT-2406", 4));
        allCourses.add(new CourseItem("Math-IV (Matrix & Complex Analysis)", "MAT-2407", 4));

        // Semester 5
        allCourses.add(new CourseItem("Financial & Managerial Accounting", "BBA-3508", 5));
        allCourses.add(new CourseItem("Database Management Systems", "CSE-3501", 5));
        allCourses.add(new CourseItem("Database Management Systems Lab", "CSE-3502L", 5));
        allCourses.add(new CourseItem("Computer Graphics & Animation", "CSE-3503", 5));
        allCourses.add(new CourseItem("Computer Graphics & Animation Lab", "CSE-3504L", 5));
        allCourses.add(new CourseItem("Communication Engineering", "CSE-3505", 5));
        allCourses.add(new CourseItem("Technical Writing & Presentation", "CSE-3506", 5));
        allCourses.add(new CourseItem("Computer Peripherals and Interfacing", "CSE-3507", 5));
        allCourses.add(new CourseItem("Viva Voce", "CSE-3509", 5));

        // Semester 6
        allCourses.add(new CourseItem("Operating System", "CSE-3601", 6));
        allCourses.add(new CourseItem("Operating System Lab", "CSE-3602L", 6));
        allCourses.add(new CourseItem("Computer Networks & Cyber Security", "CSE-3603", 6));
        allCourses.add(new CourseItem("Computer Networks & Cyber Security Lab", "CSE-3604L", 6));
        allCourses.add(new CourseItem("Computer Architecture", "CSE-3605", 6));
        allCourses.add(new CourseItem("Simulation and Modeling", "CSE-3606", 6));
        allCourses.add(new CourseItem("Computer Ethics and Cyber Law", "CSE-3607", 6));
        allCourses.add(new CourseItem("Mobile Application Lab", "CSE-3608L", 6));
        allCourses.add(new CourseItem("Viva Voce", "CSE-3609", 6));

        // Semester 7
        allCourses.add(new CourseItem("Software Engineering", "CSE-4701", 7));
        allCourses.add(new CourseItem("Software Engineering Lab", "CSE-4702L", 7));
        allCourses.add(new CourseItem("Artificial Intelligence", "CSE-4703", 7));
        allCourses.add(new CourseItem("Artificial Intelligence Lab", "CSE-4704L", 7));
        allCourses.add(new CourseItem("Compiler Design", "CSE-4705", 7));
        allCourses.add(new CourseItem("Compiler Design Lab", "CSE-4706L", 7));
        allCourses.add(new CourseItem("Research Methodology", "CSE-4707", 7));
        allCourses.add(new CourseItem("Viva Voce", "CSE-4709", 7));

        // Semester 8
        allCourses.add(new CourseItem("Machine Learning", "CSE-4801", 8));
        allCourses.add(new CourseItem("Machine Learning Lab", "CSE-4802L", 8));
        allCourses.add(new CourseItem("Data Mining", "CSE-4803", 8));
        allCourses.add(new CourseItem("Data Mining Lab", "CSE-4804L", 8));
        allCourses.add(new CourseItem("Final Year Project/Thesis", "CSE-4805", 8));
        allCourses.add(new CourseItem("Entrepreneurship & Innovation", "CSE-4806", 8));
        allCourses.add(new CourseItem("Viva Voce", "CSE-4809", 8));

        // Initialize adapter with first semester courses by default
        adapter = new CourseAdapter(this, getSemesterCourses(1));
        courseListView.setAdapter(adapter);

        // Update the bottom text
        updateBottomText(1);
    }

    private void updateBottomText(int semester) {
        String[] semesterNames = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        String bottomText = " 2025 " + semesterNames[semester - 1] + " Semester - CSE Department";
        TextView bottomTextView = findViewById(R.id.bottomTextView);
        if (bottomTextView != null) {
            bottomTextView.setText(bottomText);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.semester_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

       if (id == R.id.action_semester_1) {
            updateCourseList(1);
            return true;
        } else if (id == R.id.action_semester_2) {
            updateCourseList(2);
            return true;
        } else if (id == R.id.action_semester_3) {
            updateCourseList(3);
            return true;
        } else if (id == R.id.action_semester_4) {
            updateCourseList(4);
            return true;
        } else if (id == R.id.action_semester_5) {
            updateCourseList(5);
            return true;
        } else if (id == R.id.action_semester_6) {
            updateCourseList(6);
            return true;
        } else if (id == R.id.action_semester_7) {
            updateCourseList(7);
            return true;
        } else if (id == R.id.action_semester_8) {
            updateCourseList(8);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private List<CourseItem> getSemesterCourses(int semester) {
        List<CourseItem> filteredCourses = new ArrayList<>();
        for (CourseItem course : allCourses) {
            if (course.getSemester() == semester) {
                filteredCourses.add(course);
            }
        }
        return filteredCourses;
    }

    private void updateCourseList(int semester) {
        currentSemester = semester;
        String[] semesterNames = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        
        // Update the semester title TextView
        if (semesterTitleTextView != null) {
            semesterTitleTextView.setText(semesterNames[semester - 1] + " Semester");
        }
        
        // Load the animation
        Animation fadeInRight = AnimationUtils.loadAnimation(this, R.anim.fade_in_right);
        
        // Apply animation to the list view
        ListView courseListView = findViewById(R.id.courseListView);
        if (courseListView != null) {
            courseListView.startAnimation(fadeInRight);
        }
        
        // Update the course listing using the adapter's updateList method
        if (adapter != null) {
            List<CourseItem> semesterCourses = getSemesterCourses(semester);
            ((CourseAdapter) adapter).updateList(semesterCourses);
        }
        
        // Update the bottom text
        updateBottomText(semester);
    }
}