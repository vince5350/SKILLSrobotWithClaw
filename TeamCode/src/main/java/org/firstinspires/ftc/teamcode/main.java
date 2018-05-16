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
        boolean buttonX = gamepad1.x;
        boolean buttonY = gamepad1.y;

        leftStickY1 = Range.clip(gamepad1.left_stick_y,-0.7,0.7);
        rightStickY1 = Range.clip(gamepad1.right_stick_y,-0.7,0.7);

        drive.drive(leftStickY1, rightStickY1);

        //Shovel
        if(buttonA){
            //shovel.shovel(260);
            robot.shovelLeft.setPosition(1);
            robot.shovelRight.setPosition(1);
            }
        if(buttonB){
            //shovel.shovel(80);
            robot.shovelLeft.setPosition(0.85);
            robot.shovelRight.setPosition(0.85);
        }

        //Arm
        if(buttonX){
            shovel.arm(180);
        }
        if(buttonY) {
            shovel.arm(0);
        }

    }
    public void stop(){}
}