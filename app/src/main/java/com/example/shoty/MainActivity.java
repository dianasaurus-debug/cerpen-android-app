package com.example.shoty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook ;
    RecyclerView recyclerView;
    ArrayList<String> Number;
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerViewCategory RecyclerViewHorizontalAdapter;
    LinearLayoutManager HorizontalLayout ;
    View ChildView ;
    int RecyclerViewItemPosition ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstBook = new ArrayList<Book>();
        final ArrayList<Book> romBook = new ArrayList<Book>();
        ArrayList<Book> horBook = new ArrayList<Book>();
        ArrayList<Book> thrilBook = new ArrayList<Book>();
        ArrayList<Book> FamBook = new ArrayList<Book>();
        ArrayList<Book> friendBook = new ArrayList<Book>();
        ArrayList<Book> dramaBook = new ArrayList<Book>();
        ArrayList<Book> SchoolBook = new ArrayList<Book>();
        lstBook.addAll(BookData.getListData());
        for (int i = 0; i < lstBook.size(); i++) {
            if(lstBook.get(i).getCategory().toLowerCase().equals("romance")){
                romBook.add(lstBook.get(i));
            }
            if(lstBook.get(i).getCategory().toLowerCase().equals("horror")){
                horBook.add(lstBook.get(i));
            }
            if(lstBook.get(i).getCategory().toLowerCase().equals("thriller")){
                thrilBook.add(lstBook.get(i));
            }
            if(lstBook.get(i).getCategory().toLowerCase().equals("family")){
                FamBook.add(lstBook.get(i));
            }
            if(lstBook.get(i).getCategory().toLowerCase().equals("drama")){
                dramaBook.add(lstBook.get(i));
            }
            if(lstBook.get(i).getCategory().toLowerCase().equals("friendship")){
                friendBook.add(lstBook.get(i));
            }
            if(lstBook.get(i).getCategory().toLowerCase().equals("school life")){
                SchoolBook.add(lstBook.get(i));
            }
        }

        final RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        final RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        final RecyclerViewAdapter romAdapter = new RecyclerViewAdapter(this,romBook);
        final RecyclerViewAdapter horAdapter = new RecyclerViewAdapter(this,horBook);
        final RecyclerViewAdapter thrilAdapter = new RecyclerViewAdapter(this,thrilBook);
        final RecyclerViewAdapter draAdapter = new RecyclerViewAdapter(this,dramaBook);
        final RecyclerViewAdapter famAdapter = new RecyclerViewAdapter(this,FamBook);
        final RecyclerViewAdapter friendAdapter = new RecyclerViewAdapter(this,friendBook);
        final RecyclerViewAdapter schoolAdapter = new RecyclerViewAdapter(this,SchoolBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview1);
        myrv.setAdapter(myAdapter);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(RecyclerViewLayoutManager);

        // Adding items to RecyclerView.
        AddItemsToRecyclerViewArrayList();

        RecyclerViewHorizontalAdapter = new RecyclerViewCategory(Number);

        HorizontalLayout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView.setAdapter(RecyclerViewHorizontalAdapter);
        // Adding on item click listener to RecyclerView.
        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {

                @Override public boolean onSingleTapUp(MotionEvent motionEvent) {
                    return true;
                }

            });
            @Override
            public boolean onInterceptTouchEvent(RecyclerView Recyclerview, MotionEvent motionEvent) {
                ChildView = Recyclerview.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if(ChildView != null && gestureDetector.onTouchEvent(motionEvent)) {
                    //Getting clicked value.
                    RecyclerViewItemPosition = Recyclerview.getChildAdapterPosition(ChildView);

                    // Showing clicked item value on screen using toast message.
                    if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("all")){
                        myrv.setAdapter(myAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("romance")){
                        myrv.setAdapter(romAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("horror")){
                        myrv.setAdapter(horAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("drama")){
                        myrv.setAdapter(draAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("thriller")){
                        myrv.setAdapter(thrilAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("family")){
                        myrv.setAdapter(famAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("school life")){
                        myrv.setAdapter(schoolAdapter);
                    }
                    else if(Number.get(RecyclerViewItemPosition).toLowerCase().equals("friendship")){
                        myrv.setAdapter(friendAdapter);
                    }
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView Recyclerview, MotionEvent motionEvent) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        PreferenceManager prefManager = new PreferenceManager(getApplicationContext());
        if(prefManager.isFirstTimeLaunch()){
            prefManager.setFirstTimeLaunch(false);
            startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
            finish();
        }
    }
    public void AddItemsToRecyclerViewArrayList(){
        Number = new ArrayList<>();
        Number.add("ALL");
        Number.add("ROMANCE");
        Number.add("HORROR");
        Number.add("THRILLER");
        Number.add("SCHOOL LIFE");
        Number.add("DRAMA");
        Number.add("FAMILY");
        Number.add("FRIENDSHIP");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_profile:
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                finish();
                return true;
            default:
                break;
        }

        return false;
    }
}