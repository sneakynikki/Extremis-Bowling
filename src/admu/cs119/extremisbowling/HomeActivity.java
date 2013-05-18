package admu.cs119.extremisbowling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {
   
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_home);
        
        Button play = (Button) findViewById(R.id.button1);
		play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(HomeActivity.this, ExtremisBowling.class);
				startActivity(i);
			}
		});
		
		 Button how = (Button) findViewById(R.id.button2);
			how.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					Intent i = new Intent(HomeActivity.this, HowToPlay.class);
					startActivity(i);
				}
			});
					
		
		Button exit = (Button) findViewById(R.id.button3);
		exit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				finish();
			}
		});

	}       
}

