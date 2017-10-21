package com.example.jordan.icook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton receiptButton1 = (ImageButton)(findViewById(R.id.receiptButton1));
        receiptButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent receiptswindow = new Intent(MainActivity.this, receipt_Scanner.class);
                startActivity(receiptswindow);
            }
        });

        ImageButton pantryButton2 = (ImageButton)(findViewById(R.id.pantryButton2));
        pantryButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pantrywindow = new Intent(MainActivity.this, PantryActivity.class);
                startActivity(pantrywindow);
            }
        });

        ImageButton recipesButton3 = (ImageButton)(findViewById(R.id.recipesButton3));
        recipesButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recipewindow = new Intent(MainActivity.this, RecipeActivity.class);
                startActivity(recipewindow);

            }
        });

        ImageButton helpButton5 = (ImageButton)(findViewById(R.id.helpButton5));
        helpButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpwindow = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(helpwindow);
            }
        });

    }
}
