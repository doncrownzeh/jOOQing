package com.crownzeh.app.task;

import java.time.LocalTime;
import java.util.TimerTask;

public class CustomTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("wykona�em si� o: " + LocalTime.now());
    }

}