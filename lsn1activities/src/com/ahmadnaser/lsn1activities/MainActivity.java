package com.ahmadnaser.lsn1activities;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	
	Button b,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
Log.d("AHmad", "activity is created");

View v=findViewById(R.id.button1);
b=(Button)v;

v=findViewById(R.id.button2);
b2=(Button)v;

b.setOnClickListener(this);
b2.setOnClickListener(this);



	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	
	if(v==b){
	Log.d("Button1", "Button is clicked");
	
Toast.makeText(this.getBaseContext(), "El MEssage", Toast.LENGTH_SHORT).show();

	}
	else{
Toast.makeText(this.getBaseContext(), "Seccond Button", Toast.LENGTH_SHORT).show();
	}
}
	
}
