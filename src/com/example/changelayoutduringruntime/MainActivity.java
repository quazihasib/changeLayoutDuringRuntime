package com.example.changelayoutduringruntime;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity implements OnSeekBarChangeListener
{

	SeekBar sbWeight;
	Button btn1;
	Button btn2;

	LinearLayout.LayoutParams lParams1;
	LinearLayout.LayoutParams lParams2;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		sbWeight = (SeekBar) findViewById(R.id.sbWeight);
		sbWeight.setOnSeekBarChangeListener(this);

	    btn1 = (Button) findViewById(R.id.btn1); 
	    btn2 = (Button) findViewById(R.id.btn2);

	    lParams1 = (LinearLayout.LayoutParams) btn1.getLayoutParams();
	    lParams2 = (LinearLayout.LayoutParams) btn2.getLayoutParams();
	    
	    
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) 
	{
		// TODO Auto-generated method stub
		
		int leftValue = progress;
		int rightValue = seekBar.getMax() - progress;
		    
		// configure the weight
		lParams1.weight = leftValue;
		lParams2.weight = rightValue;
		
		// write the value of variables into the buttons text
		btn1.setText(String.valueOf(leftValue));
		btn2.setText(String.valueOf(rightValue));
		
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar)
	{
		// TODO Auto-generated method stub
		
	}

}
