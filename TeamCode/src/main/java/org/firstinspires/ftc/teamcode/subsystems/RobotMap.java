package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.FLOAT;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

public class RobotMap {
    public DcMotor leftWheel = null;
    public DcMotor rightWheel = null;

    public Servo shovelLeft = null;
    public Servo shovelRight = null;
    public Servo shovelArm = null;

    public RobotMap(){}

    public void init(HardwareMap hwMap){
        //Drive
        leftWheel = hwMap.dcMotor.get("Left");
        rightWheel = hwMap.dcMotor.get("Right");

        leftWheel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightWheel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftWheel.setZeroPowerBehavior(FLOAT);
        rightWheel.setZeroPowerBehavior(FLOAT);

        leftWheel.setDirection(REVERSE);

        //Shovel
        shovelLeft = hwMap.servo.get("Left Shovel");
        shovelRight = hwMap.servo.get("Right Shovel");
        shovelArm = hwMap.servo.get("Shovel Arm");
        shovelLeft.setDirection(Servo.Direction.REVERSE);
    }

}


