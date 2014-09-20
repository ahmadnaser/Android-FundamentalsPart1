package com.example.lsn2lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main2Activity extends Activity implements OnClickListener {
	public String tag="ActiviyState ",msg="ActiviyState ";
	public Button b1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		View v=findViewById(R.id.button1);
		b1=(Button)v;
		
		b1.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main2, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(this.b1==v)
		{
			Log.d(tag, msg);
			Intent i=new Intent(this.getBaseContext(),Main2Activity.class);
			startActivity(i);
		
		}
	}

}
