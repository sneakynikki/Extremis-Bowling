package admu.cs119.extremisbowling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HowToPlay extends Activity {
   
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.how_to_screen);
        
        Button back = (Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				Intent i = new Intent(HowToPlay.this, HomeActivity.class);
				startActivity(i);
			}
		});
        		        
    }
}
