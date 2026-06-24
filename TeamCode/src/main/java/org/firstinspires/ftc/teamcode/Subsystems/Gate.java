package org.firstinspires.ftc.teamcode.Subsystems;

public class Gate {
    public static long OPEN_TIME = 1000; //How many milis the gate is open for.
    Stopwatch gateTimer = new Stopwatch();
    public void shoot(){
        gateTimer.go();
        //Set the state to open
    }
    public void update(){
        //Times passed is more than 1000 milis
        if (gateTimer.timePassed() > OPEN_TIME){
            //Do something
        }
    }
}
