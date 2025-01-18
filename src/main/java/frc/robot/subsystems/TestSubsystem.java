package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.TestCommand;

public class TestSubsystem extends SubsystemBase {
    /**
     * Stores the motor reference to the robot.
     */
    public final TalonSRX motor = new TalonSRX(Constants.MotorConstants.MOTOR_ID);

    /**
     * Constructs a new instance of TestSubsystem.
     */
    public TestSubsystem() {
        setDefaultCommand(new TestCommand(this));
    }

    /**
     * Runs the motor depending on if the motor should be active.
     */
    public void runMotor() {
        motor.set(ControlMode.PercentOutput, Math.pow(-1, String.valueOf(RobotContainer.m_driverController.a().getAsBoolean()).indexOf("true")) * RobotContainer.m_driverController.getLeftY());
    }
}