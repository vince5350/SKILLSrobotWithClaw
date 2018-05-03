package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    private Servo clawLeft, clawRight, clawJoint = null;


    public Claw(Servo clawLeft, Servo clawRight, Servo clawJoint) {
        this.clawLeft = clawLeft;
        this.clawRight = clawRight;
        this.clawJoint = clawJoint;
    }


    public int claw(int clawAngle){
        this.clawLeft.setPosition(clawAngle);
        this.clawRight.setPosition(clawAngle);
        return clawAngle;
    }

    public int joint(int clawAngle){
        this.clawJoint.setPosition(clawAngle);
        return clawAngle;
    }

}