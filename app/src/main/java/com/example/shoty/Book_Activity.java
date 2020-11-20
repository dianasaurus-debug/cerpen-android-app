package com.example.shoty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory, tvauthor;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_book);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Book_Activity.this, MainActivity.class));
                finish();
            }
        });
        tvtitle = (TextView) findViewById(R.id.txttitle);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvcategory = (TextView) findViewById(R.id.txtCat);
        tvauthor = (TextView) findViewById(R.id.author);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Category = intent.getExtras().getString("Category");
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Author = intent.getExtras().getString("Author");
        int image = intent.getExtras().getInt("Thumbnail") ;
        tvtitle.setText(Title);
        tvauthor.setText(Author);
        tvcategory.setText(Category);
        tvdescription.setText(Description);
        img.setImageResource(image);


    }
}
