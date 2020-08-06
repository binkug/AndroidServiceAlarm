package com.example.android0805;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(
                context, "알람", Toast.LENGTH_LONG)
                .show();
        //새로 생성
        MediaPlayer player = MediaPlayer.create(
                context, R.raw.spice);
        player.start();
    }
}

