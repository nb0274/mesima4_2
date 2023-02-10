package com.example.mesima4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageView image;
    int ranNum;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        image = (ImageView) findViewById(R.id.imagenum);
        imageButton.setImageResource(R.drawable.image_clikforimage);
    }

    public void clicker(View view) {
        ranNum = rand.nextInt(3 + 1);
        if (ranNum == 1) {
            imageButton.setImageResource(R.drawable.one);
            image.setImageResource(R.drawable.shlek);
        }
        if (ranNum == 2) {
            imageButton.setImageResource(R.drawable.two);
            image.setImageResource(R.drawable.shlek2);
        }
        if (ranNum == 3) {
            imageButton.setImageResource(R.drawable.three);
            image.setImageResource(R.drawable.shlek3);
        }
    }
}
