package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.subsystems.*;
import org.firstinspires.ftc.teamcode.subsystems.hwMap;


@TeleOp
public class main extends OpMode {

    public main(){}

    private hwMap robot = new hwMap();
    private roller spin = new roller();

    public void init(){
        robot.init(hardwareMap);
    }
    public void start(){}
    public void loop(){
        double leftStickY1, rightStickY1;
        leftStickY1 = Range.clip(gamepad1.left_stick_y,-0.7,0.7);
        rightStickY1 = Range.clip(gamepad1.right_stick_y,-0.7,0.7);

        robot.backLeftWheel.setPower(leftStickY1);
        robot.frontLeftWheel.setPower(leftStickY1);

        robot.backRightWheel.setPower(rightStickY1);
        robot.frontRightWheel.setPower(rightStickY1);

        spin.speed(2.1);

    }
    public void stop(){}
}