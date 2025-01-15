package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestSubsystem extends SubsystemBase {
    /**
     * The motor that was used to run
     */
    public final TalonSRX motor = new TalonSRX(17);

    /**
     * motorActivated is a boolean that is only acessible by all instances of
     * TestSubsystem as its both a private and a static variable.
     * The setter allows it to be accessible to other classes.
     */
    private static boolean motorActivated = false;

    /**
     * Constructs a new instance of TestSubsystem.
     */
    public TestSubsystem()
    {}

    /**
     * Runs the motor depending on if the motor should be active.
     */
    public void runMotor() {
        if(motorActivated)
            motor.set(ControlMode.PercentOutput, .1);
        else
            motor.set(ControlMode.PercentOutput, 0);
    }

    /**
     * A setter for motor activation.
     * @param motorActivated is true if the motor should be active, false otherwise.
     */
    public static void setMotor(boolean motorActivated)
    {
        TestSubsystem.motorActivated = motorActivated;
    }
}