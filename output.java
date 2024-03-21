
// TankDrivetrainSubsystem.java

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TankDrivetrainSubsystem {
    private final SpeedControllerGroup leftMotors;
    private final SpeedControllerGroup rightMotors;
    private final DifferentialDrive differentialDrive;

    public TankDrivetrainSubsystem(SpeedControllerGroup leftMotors, SpeedControllerGroup rightMotors) {
        this.leftMotors = leftMotors;
        this.rightMotors = rightMotors;
        differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        differentialDrive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop() {
        differentialDrive.stopMotor();
    }
}
