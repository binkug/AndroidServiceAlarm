package com.example.androidbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //토스트 하나를 출력
        Toast.makeText(context,"방송 수신",Toast.LENGTH_SHORT).show();

        //MainActivity를 출력
        //다른 Application에서 이 Application을 실행
        Intent mainIntent = new Intent(context,ReceiverActivity.class);
        //실행을 하지 않았더라도 설치 되어 있으면 호출될 수 있도록 섫정
        mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //액티비티 호출
        context.startActivity(mainIntent);

    }
}
