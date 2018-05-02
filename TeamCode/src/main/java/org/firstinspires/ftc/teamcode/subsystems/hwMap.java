package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import static com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior.BRAKE;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

public class hwMap {
    public DcMotor backLeftWheel = null;
    public DcMotor frontLeftWheel = null;
    public DcMotor backRightWheel = null;
    public DcMotor frontRightWheel = null;

    public DcMotor spinWheel = null;

    private HardwareMap hwMap;

    public hwMap(){}

    public void init(HardwareMap ahwMap){
        hwMap = ahwMap;
        backLeftWheel = hwMap.dcMotor.get("Back Left");
        frontLeftWheel = hwMap.dcMotor.get("Front Left");
        backRightWheel = hwMap.dcMotor.get("Back Right");
        frontRightWheel = hwMap.dcMotor.get("Front Right");

        backLeftWheel.setZeroPowerBehavior(BRAKE);
        frontLeftWheel.setZeroPowerBehavior(BRAKE);
        backRightWheel.setZeroPowerBehavior(BRAKE);
        frontRightWheel.setZeroPowerBehavior(BRAKE);

        backLeftWheel.setDirection(REVERSE);
        frontLeftWheel.setDirection(REVERSE);

    }

}


