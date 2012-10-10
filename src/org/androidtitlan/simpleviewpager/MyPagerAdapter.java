package org.androidtitlan.simpleviewpager;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class MyPagerAdapter extends PagerAdapter {

	private final SimpleViewPager activity;

	/**
	 * @param simpleViewPagerActivity
	 */
	MyPagerAdapter(SimpleViewPager simpleViewPagerActivity) {
		activity = simpleViewPagerActivity;
	}

	public int getCount() {
		return 7;
	}

	public Object instantiateItem(View collection, int position) {

		LayoutInflater inflater = (LayoutInflater) collection.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		int resId = 0;
		switch (position) {
		case 0:
			resId = R.layout.dan;
			break;
		case 1:
			resId = R.layout.van;
			break;
		case 2:
			resId = R.layout.jarek;
			break;
		case 3:
			resId = R.layout.nicolas;
			break;
		case 4:
			resId = R.layout.neto;
			break;
		case 5:
			resId = R.layout.paco;
			break;
		case 6:
			resId = R.layout.vaz;
			break;
		}

		View view = inflater.inflate(resId, null);

		((ViewPager) collection).addView(view, 0);

		return view;
	}

	public void destroyItem(View arg0, int arg1, Object arg2) {
		((ViewPager) arg0).removeView((View) arg2);

	}

	public void finishUpdate(View arg0) {
		// TODO Auto-generated method stub

	}

	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == ((View) arg1);

	}

	public void restoreState(Parcelable arg0, ClassLoader arg1) {
		// TODO Auto-generated method stub

	}

	public Parcelable saveState() {
		// TODO Auto-generated method stub
		return null;
	}

	public void startUpdate(View arg0) {
		// TODO Auto-generated method stub

	}

}
