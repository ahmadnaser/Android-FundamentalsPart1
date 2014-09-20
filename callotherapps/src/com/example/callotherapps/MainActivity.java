package com.example.callotherapps;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	 static final int PICK_CONTACT_REQUEST = 0;
	public View v;
	public Button b1,b2,b3,b4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		
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
		if(b2==v)
		{
Intent intent = new Intent(android.content.Intent.ACTION_DIAL,Uri.parse("tel:5556"));
startActivity(intent);
		}else if(b1==v)
		{
			//Open Browser
			Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("https://www.ahmadnaser.com"));
			startActivity(intent);
		}
		else if(b3==v)
		{
		//	Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:?q=27,26"));
		//  startActivity(intent);
			    String urlAddress = "http://maps.google.com/maps?q="+ 27  +"," + 26 +"("+ "dubai" + ")&iwloc=A&hl=en";     
			    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
			    startActivity(intent);
			
		}else if(b4==v)
		{
		      Intent intent = new Intent(android.content.Intent.ACTION_PICK);
		      intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
		     // startActivity(intent);
		 
		      
		      
		     startActivityForResult(intent, 1); 
		   
		}else
		{
			
		}
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
            Intent data) {
        if (requestCode == PICK_CONTACT_REQUEST) {
            if (resultCode == RESULT_OK) {
                // A contact was picked.  Here we will just display it
                // to the user.
 //	Toast.makeText(this.getBaseContext(), "aaa"+data.getData().toString(), Toast.LENGTH_LONG).show();
 // startActivity(new Intent(Intent.ACTION_VIEW, data.getData()));
           
            	Bundle b=	data.getExtras();

				//	Toast.makeText(this,b.toString(), Toast.LENGTH_LONG).show();
				  // Intent intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse(data.getData().toString()));
				  // startActivity(intent);  	
            
        }}}

}
