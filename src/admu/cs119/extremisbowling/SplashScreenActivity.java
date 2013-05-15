package admu.cs119.extremisbowling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class SplashScreenActivity extends Activity {
	
	private static final int SPLASH_DISPLAY_TIME = 3000; /* 3 seconds */

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash_screen);


	    new Handler().postDelayed(new Runnable() {

	        public void run() {

	            Intent mainIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
	            SplashScreenActivity.this.startActivity(mainIntent);

	            SplashScreenActivity.this.finish();
	            overridePendingTransition(R.anim.mainfadein,
	                    R.anim.splashfadeout);
	        }
	    }, SPLASH_DISPLAY_TIME); 
	}
}

