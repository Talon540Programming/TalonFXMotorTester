package frc.robot;

import edu.wpi.first.wpilibj.RobotController;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonFX;


public class Robot extends TimedRobot {
    PWMTalonFX testingMotor = new PWMTalonFX(0);

    @Override
    public void robotPeriodic() {
        testingMotor.set(RobotController.getUserButton() ? 0.75 : 0);
    }

}
