package org.firstinspires.ftc.teamcode.Subsystems;

public class Stopwatch {
    public long startTime = System.currentTimeMillis();
    public void go(){
        startTime = System.currentTimeMillis();
    }
    public long timePassed(){
        return  System.currentTimeMillis() - startTime;
    }
}
