package com.coreservlets.buttonsexercises;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.app.Activity;
import android.graphics.Color;

public class ButtonsExercisesActivity extends Activity {
    private TextView mBottomArea;
    private RadioGroup mRadioGroup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mBottomArea = (TextView)findViewById(R.id.bottom_area);
        mRadioGroup = (RadioGroup)findViewById(R.id.radio_group);
    }

    public void turnBottomAreaRed(View clickedButton) {
        colorBottom(Color.RED);
    }
    
    public void turnBottomAreaBlue(View clickedButton) {
        colorBottom(Color.BLUE);
    }
    
    public void turnBottomAreaGreen(View clickedButton) {
        colorBottom(Color.GREEN);
    }
    
    private void colorBottom(int color) {
        mBottomArea.setBackgroundColor(color);
    }
    
    public void toggleBottomAreaRed(View clickedToggleButton) {
        toggleBottomArea(clickedToggleButton, Color.RED);
    }
    
    public void toggleBottomAreaBlue(View clickedToggleButton) {
        toggleBottomArea(clickedToggleButton, Color.BLUE);
    }
    
    public void toggleBottomAreaGreen(View clickedToggleButton) {
        toggleBottomArea(clickedToggleButton, Color.GREEN);
    }
    
    private void toggleBottomArea(View clickedToggleButton, int color) {
        ToggleButton toggleButton = 
                (ToggleButton)clickedToggleButton;
         if (toggleButton.isChecked()) {
             colorBottom(color);
         } else {
             colorBottom(Color.BLACK);
         }
    }
    
    public void turnBottomAreaAsSelected(View clickedButton) {
        int radioButtonId = mRadioGroup.getCheckedRadioButtonId();
        switch(radioButtonId) {
            case R.id.red_radio_button: colorBottom(Color.RED); break;
            case R.id.blue_radio_button: colorBottom(Color.BLUE); break;
            case R.id.green_radio_button: colorBottom(Color.GREEN); break;
            default: colorBottom(Color.BLACK);
        }
    }
}
