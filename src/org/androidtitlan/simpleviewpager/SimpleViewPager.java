package org.androidtitlan.simpleviewpager;


import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;

public class SimpleViewPager extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simple_view_pager);

		MyPagerAdapter adapter = new MyPagerAdapter(this);
		ViewPager myPager = (ViewPager) findViewById(R.id.pager);
		myPager.setAdapter(adapter);
		myPager.setCurrentItem(0); 
	}

}
