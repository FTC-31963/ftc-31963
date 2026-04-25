package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "real (Blocks to Java)")
public class real extends LinearOpMode {

  private DcMotor frontright;
  private DcMotor frontleft;
  private DcMotor backright;
  private DcMotor backleft;

  /**
   * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
   * Comment Blocks show where to place Initialization code (runs once, after touching the
   * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
   * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
   * Stopped).
   */
  @Override
  public void runOpMode() {
    frontright = hardwareMap.get(DcMotor.class, "frontright");
    frontleft = hardwareMap.get(DcMotor.class, "frontleft");
    backright = hardwareMap.get(DcMotor.class, "backright");
    backleft = hardwareMap.get(DcMotor.class, "backleft");

    // Put initialization blocks here.
    frontright.setDirection(DcMotor.Direction.FORWARD);
    frontleft.setDirection(DcMotor.Direction.FORWARD);
    backright.setDirection(DcMotor.Direction.FORWARD);
    backleft.setDirection(DcMotor.Direction.FORWARD);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        backright.setPower(-gamepad1.left_stick_y);
        backleft.setPower(-gamepad1.left_stick_y);
        frontleft.setPower(-gamepad1.right_stick_y);
        frontright.setPower(-gamepad1.right_stick_y);
        if (gamepad1.x) {
          frontleft.setPower(60);
          frontright.setPower(-60);
          backright.setPower(-60);
          backleft.setPower(60);
        }
        if (gamepad1.b) {
          frontleft.setPower(-60);
          frontright.setPower(60);
          backright.setPower(60);
          backleft.setPower(-60);
        }
      }
    }
  }
}
