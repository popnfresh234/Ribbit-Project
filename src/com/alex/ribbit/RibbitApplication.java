package com.alex.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "XK0x5U5x1QCmfTbuT8wSxHDCSwie66bDp9L4ZW5Q",
				"Ced2wQOmFuqlJiA4HLaIcgbB4f72XhqazK2MhamD");
		
	}

}
