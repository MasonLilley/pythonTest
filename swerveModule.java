
public class SwerveModule {
    private Talon motor;
    private Talon steering;
    private double encoderOffset;

    public SwerveModule(int motorChannel, int steeringChannel) {
        motor = new Talon(motorChannel);
        steering = new Talon(steeringChannel);
        encoderOffset = 0.0;
    }

    public void setMotorSpeed(double speed) {
        motor.set(speed);
    }

    public void setSteeringAngle(double angle) {
        double steeringValue = angle / 360.0;
        steering.set(steeringValue);
    }

    public double getEncoderValue() {
        return motor.getEncoderValue() - encoderOffset;
    }

    public void resetEncoderOffset() {
        encoderOffset = motor.getEncoderValue();
    }
}
  