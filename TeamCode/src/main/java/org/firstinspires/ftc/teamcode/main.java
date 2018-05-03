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
    private Claw claw = null;
    private Wheels drive = null;

    public void init(){
        robot.init(hardwareMap);
        claw = new Claw(robot.clawLeft, robot.clawRight,
                    robot.clawJoint);
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
    }
    public void stop(){}
}