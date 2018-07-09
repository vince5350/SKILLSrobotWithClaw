package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Wheels {
    private DcMotor leftWheel, rightWheel = null;

    public Wheels(DcMotor leftWheel, DcMotor rightWheel) {
        this.leftWheel = leftWheel;
        this.rightWheel = rightWheel;
    }

    public void drive(double left, double right){
        leftWheel.setPower(left/2);
        rightWheel.setPower(right/2);
    }
}
