package com.tutorialspoint.broatcast;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class MyReceiver extends BroadcastReceiver{
@Override
    public void onReceive(Context context, Intent intent) {
             Toast.makeText(context, "Intent Received!.", Toast.LENGTH_LONG).show();
    }
}
