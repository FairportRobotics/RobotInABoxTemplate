package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestSubsystem extends SubsystemBase {
    /**
     * Stores the motor reference to the robot.
     */
    public final TalonSRX motor = new TalonSRX(Constants.MotorConstants.MOTOR_ID);

    /**
     * Stores whether the robot should be active.
     */
    private static boolean motorActivated = true;

    /**
     * Constructs a new instance of TestSubsystem.
     */
    public TestSubsystem() {}

    /**
     * Runs the motor depending on if the motor should be active.
     */
    public void runMotor() {
        if (motorActivated)
            motor.set(ControlMode.PercentOutput, .1);
        else
            motor.set(ControlMode.PercentOutput, 0);
    }

    /**
     * A setter for motor activation.
     * 
     * @param motorActivated is true if the motor should be active, false otherwise.
     */
    public void setMotorActivated(boolean motorActivated) {
        TestSubsystem.motorActivated = motorActivated;
    }
}