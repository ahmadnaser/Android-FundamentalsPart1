package com.example.lsn2lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
public String tag="ActiviyState ";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d(tag,"Created");
	}
	
	
	public void onStart()
	{
		super.onStart();
		Log.d(tag,"Started");
		
	}
	
	public void onResume()
	{
		
	super.onResume();
	Log.d(tag,"Resumed");
	}
	
	public void onPause()
	{
		super.onPause();
		Log.d(tag,"Paused");
	}
	
	public void onStop()
	{
		super.onStop();
		Log.d(tag,"Stoped");
	}
	
	public void onRestart()
	{
		super.onRestart();
		Log.d(tag,"Restarted");
	}
	
	public void onDestroy()
	{
		super.onDestroy();
		Log.d(tag,"Destroyed");
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
