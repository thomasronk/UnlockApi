package com.qualcomm.gps;

import java.io.PrintWriter;
import java.io.StringWriter;

import android.app.KeyguardManager;
import android.app.Service;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Intent;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;

public class UnlockService extends Service{
	String TAG = "UnlockService";
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.d(TAG, "ServiceStarted");
		
			//Setting Screen Timeout to 30 minutes
			Settings.System.putString(getContentResolver(), Settings.System.SCREEN_OFF_TIMEOUT, "300000000");
			
			//Disabling screen lock indefinitely.
			KeyguardManager km = (KeyguardManager)getSystemService(KEYGUARD_SERVICE);
		    KeyguardLock kl = km.newKeyguardLock("keyguard_lock");
		    kl.disableKeyguard();
		
		return super.onStartCommand(intent, flags, startId);
	}

}
