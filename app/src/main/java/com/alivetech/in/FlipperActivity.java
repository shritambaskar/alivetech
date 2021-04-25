package com.alivetech.in;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class FlipperActivity extends AppCompatActivity {

    private SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);

        initialise();
        sliderAnimation();
    }

    private void sliderAnimation() {
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setScrollTimeInSec(1);
        setSliderView();
    }

    private void setSliderView() {
        for(int i = 0; i <= 4 ; i++){
            DefaultSliderView sliderView = new DefaultSliderView(this);
            switch (i){
                case 0:
                    sliderView.setImageDrawable(R.drawable.image1);
                    sliderView.setDescription("This is Image one");
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.image2);
                    sliderView.setDescription("This is Image Two");
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.image3);
                    sliderView.setDescription("This is Image Three");
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.image4);
                    sliderView.setDescription("This is Image Four");
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.image5);
                    sliderView.setDescription("This is Image Five");
                    break;
                    
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            final int myI = i;
            sliderView.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(FlipperActivity.this, "This is Slider "+(myI+1), Toast.LENGTH_SHORT).show();
                }
            });
            sliderLayout.addSliderView(sliderView);
        }
    }

    private void initialise() {

        sliderLayout = findViewById(R.id.imageSlider);
    }
}