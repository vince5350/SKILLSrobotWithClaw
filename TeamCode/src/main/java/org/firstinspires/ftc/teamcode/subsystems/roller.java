package org.firstinspires.ftc.teamcode.subsystems;


public class roller {
    public roller() {
    }

    private hwMap robot = new hwMap();

    public void speed(double ROLLER_SPEED){
        if(ROLLER_SPEED > -1 || ROLLER_SPEED < 1){
            robot.spinWheel.setPower(ROLLER_SPEED);
        }
        else if(ROLLER_SPEED > 1 || ROLLER_SPEED < -1) {
            throw new IndexOutOfBoundsException();
        }
    }
}