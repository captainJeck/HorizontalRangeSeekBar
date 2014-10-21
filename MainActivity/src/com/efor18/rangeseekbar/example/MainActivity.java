package com.efor18.rangeseekbar.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.efor18.rangeseekbar.HorizontalRangeSeekBar;
import com.efor18.rangeseekbar.HorizontalRangeSeekBar.OnRangeSeekBarChangeListener;

public class MainActivity extends Activity {

	public static final String TAG = "rangeseekbar";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView min = (TextView) findViewById(R.id.minValue);
        final TextView max = (TextView) findViewById(R.id.maxValue);
        
     // create RangeSeekBar as Integer range between 20 and 75
        HorizontalRangeSeekBar<Integer> seekBar = new HorizontalRangeSeekBar<Integer>(60, 140, this);
        seekBar.setOnRangeSeekBarChangeListener(new OnRangeSeekBarChangeListener<Integer>() {
                @Override
                public void onRangeSeekBarValuesChanged(HorizontalRangeSeekBar<?> bar, Integer minValue, Integer maxValue) {
                        // handle changed range values
//                        Log.i(TAG, "User selected new range values: MIN=" + minValue + ", MAX=" + maxValue);
                        
                        min.setText(minValue.toString());
                        max.setText(maxValue.toString());
                        
                }
        });

        // add RangeSeekBar to pre-defined layout
        ViewGroup layout = (ViewGroup) findViewById(R.id.layout);
        layout.addView(seekBar);
    }
    
}
