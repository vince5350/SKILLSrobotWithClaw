package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.Servo;

public class Shovel {

    private Servo shovelLeft, shovelRight, shovelArm = null;


    public Shovel(Servo shovelLeft, Servo shovelRight, Servo shovelArm) {
        this.shovelLeft = shovelLeft;
        this.shovelRight = shovelRight;
        this.shovelArm = shovelArm;
    }


    public void shovel(int scoopAngle){
        shovelLeft.setPosition(scoopAngle);
        shovelRight.setPosition(scoopAngle);
    }

    public int arm(int armAngle){
        this.shovelArm.setPosition(armAngle);
        return armAngle;
    }

}