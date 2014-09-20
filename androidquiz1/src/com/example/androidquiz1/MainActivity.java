package com.example.androidquiz1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	public Button button1,button2,button3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		View v=findViewById(R.id.button1);
		button1=(Button)v;
		button1.setOnClickListener(this);
		
		v=findViewById(R.id.button2);
		button2=(Button)v;
		button2.setOnClickListener(this);
		
		v=findViewById(R.id.button3);
		button3=(Button)v;
		button3.setOnClickListener(this);
		
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
		if(v==button1)
		{
			Intent in=new Intent(this.getBaseContext(),OneActivity.class);
			Bundle bundle=new Bundle();
			bundle.putString("name","ahmad");
			in.putExtras(bundle);
			startActivity(in);
		}
		else if(v==button2)
		{
			Intent in=new Intent(this.getBaseContext(),TwoActivity.class);
			startActivity(in);
		}else
		{
			Intent in=new Intent(this.getBaseContext(),ThreeActivity.class);
			startActivity(in);
			
		}
	}

}
