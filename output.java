package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class RobotContainer {

    private final Joystick joystick;

    public RobotContainer() {
        joystick = new Joystick(0);
    }

    public Joystick getJoystick() {
        return joystick;
    }

    public void configureButtonBindings() {
        // Add button bindings here to control the robot
    }
}