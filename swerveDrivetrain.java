
public class SwerveDrivetrain {
    private SwerveModule frontLeft;
    private SwerveModule frontRight;
    private SwerveModule backLeft;
    private SwerveModule backRight;
    
    public SwerveDrivetrain(SwerveModule frontLeft, SwerveModule frontRight, SwerveModule backLeft, SwerveModule backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }
    
    public void drive(double forward, double strafe, double rotate) {
        frontLeft.setDesiredState(forward, strafe, rotate);
        frontRight.setDesiredState(forward, strafe, rotate);
        backLeft.setDesiredState(forward, strafe, rotate);
        backRight.setDesiredState(forward, strafe, rotate);
        
        frontLeft.updateModuleState();
        frontRight.updateModuleState();
        backLeft.updateModuleState();
        backRight.updateModuleState();
    }
}
