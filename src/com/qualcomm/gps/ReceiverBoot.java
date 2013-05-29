package com.qualcomm.gps;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ReceiverBoot extends BroadcastReceiver{
	String TAG = "ReceiverBoot";
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		Log.d(TAG, "OnReceiver");
		
		Intent serviceIntent = new Intent(arg0, UnlockService.class);
		arg0.startService(serviceIntent);
	}

}
