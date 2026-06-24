package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Flywheel {
    public enum State{
        ON,
        OFF
    }
    State state = State.OFF;
    public State getState(){
        return state;
    }
    public void setState(State newState){
        state = newState;
    }
    DcMotorEx rightMotor;
    DcMotorEx leftMotor;
    public static int target = 1250;
    public static double kF = 0.00025;
    public void initiate(HardwareMap hardwareMap){
        rightMotor = hardwareMap.get(DcMotorEx.class,"flyRight");
        leftMotor = hardwareMap.get(DcMotorEx.class,"flyLeft");
        rightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void update(){
        double targetPower = 0;
        if (state == State.ON){
            targetPower = target * kF;
        }
        rightMotor.setPower(targetPower);
        leftMotor.setPower(targetPower);
    }
    public void status(Telemetry telemetry){
        telemetry.addLine("FLYWHEEL");
        telemetry.addData("VELOCITY",rightMotor.getVelocity());
    }
}
