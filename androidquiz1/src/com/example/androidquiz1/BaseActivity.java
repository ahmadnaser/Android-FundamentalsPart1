package com.example.androidquiz1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
		View v  = findViewById(R.id.textView1);
		
		Intent in=this.getIntent();
		Bundle bundle=in.getExtras();
		
		if(in.getExtras() != null){
		String Name=bundle.get("name").toString();

	
		
		TextView t=(TextView)v;
		t.setText(Name);
		}
	}

	public void BackHome(View v)
	{
		Intent in=new Intent(this.getBaseContext(),MainActivity.class);
		startActivity(in);
	}

}
