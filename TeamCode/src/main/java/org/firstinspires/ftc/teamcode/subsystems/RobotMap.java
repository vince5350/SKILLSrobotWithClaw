package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

public class RobotMap {
    public DcMotor leftWheel = null;
    public DcMotor rightWheel = null;

    public Servo clawLeft = null;
    public Servo clawRight = null;
    public Servo clawJoint = null;

    public RobotMap(){}

    public void init(HardwareMap hwMap){
        //Drive
        leftWheel = hwMap.dcMotor.get("Left");
        rightWheel = hwMap.dcMotor.get("Right");

        leftWheel.setZeroPowerBehavior(BRAKE);
        rightWheel.setZeroPowerBehavior(BRAKE);

        leftWheel.setDirection(REVERSE);

        //Claw
        clawLeft = hwMap.servo.get("Left Claw");
        clawRight = hwMap.servo.get("Right Claw");
        clawJoint = hwMap.servo.get("Claw Joint");
        clawLeft.setDirection(Servo.Direction.REVERSE);

    }

}


