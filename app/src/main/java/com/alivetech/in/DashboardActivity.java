package com.alivetech.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class DashboardActivity extends AppCompatActivity {

    private ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        int images[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3,
                R.drawable.image4,R.drawable.image5};
        initialise();

        for(int image: images){
            slideImages(image);
        }
        /*for(int i = 0 ; i<images.length ;i++){
            slideImages(images[i]);
        }*/

    }

    private void slideImages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);//3 seconds
        flipper.setAutoStart(true);

        //animation
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);
        //flipper.setContentDescription("This is Demo of Flipper");
    }

    private void initialise() {
        flipper = findViewById(R.id.v_flipper);
    }
}