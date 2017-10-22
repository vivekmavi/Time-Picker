package com.example.paras.timepicker;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TimePicker.OnTimeChangedListener {
    TimePicker timePicker;
    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(this);

        /*timePicker.setHour(5);
        timePicker.setMinute(15);
        timePicker.setIs24HourView(true);*/
    }

    @Override
    public void onTimeChanged(TimePicker timePicker, int selectedHour, int selectedMinute)
    {
     if( timePicker.getId()==R.id.timePicker)
     {
      String hour = String.valueOf(selectedHour);
      String minute = String.valueOf(selectedMinute);
      Toast.makeText(this,"selected time is "+hour+":"+selectedMinute, Toast.LENGTH_SHORT).show();
        }
    }
}
