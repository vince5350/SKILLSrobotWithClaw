package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.subsystems.*;
import org.firstinspires.ftc.teamcode.subsystems.RobotMap;

@TeleOp
public class main extends OpMode {

    public main(){}

    private RobotMap robot = new RobotMap();
    private Shovel shovel = null;
    private Wheels drive = null;

    public void init(){
        robot.init(hardwareMap);
        shovel = new Shovel(robot.shovelLeft, robot.shovelRight,
                    robot.shovelArm);
        drive = new Wheels(robot.leftWheel, robot.rightWheel);
    }
    public void start(){}
    public void loop(){
        double leftStickY1, rightStickY1;
        boolean buttonA = gamepad1.a;
        boolean buttonB = gamepad1.b;
        boolean bumpLeft = gamepad1.left_bumper;
        boolean bumpRight = gamepad1.right_bumper;

        leftStickY1 = Range.clip(gamepad1.left_stick_y,-1,1);
        rightStickY1 = Range.clip(gamepad1.right_stick_y,-1,1);

        drive.drive(leftStickY1, rightStickY1);

        //Shovel

        if(buttonB){
            //shovel.shovel(260);
            robot.shovelLeft.setPosition(1);
            robot.shovelRight.setPosition(1);
            }
        if(buttonA){
            //shovel.shovel(80);
            robot.shovelLeft.setPosition(0.75);
            robot.shovelRight.setPosition(0.75);
        }

        //Arm
        if(bumpRight){
            shovel.arm(1);
        }


        if(bumpLeft) {
            shovel.arm(-1);
        }

    }
    public void stop(){}
}