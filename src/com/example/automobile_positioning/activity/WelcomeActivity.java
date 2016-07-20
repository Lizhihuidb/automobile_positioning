package com.example.automobile_positioning.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.automobile_positioning.R;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lead);
		
		//休息三秒跳主界面
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}
		};
		timer.schedule(task, 1000*3);
	}

	
	
	
	
}
