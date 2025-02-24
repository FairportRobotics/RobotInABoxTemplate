// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.TestSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;

/** An test command that uses an test subsystem. */
public class TestCommand extends Command {
  private final TestSubsystem testSubsystem;
  private int tickCounter = 1;

  /**
   * Constructs a new instance of TestCommand.
   * 
   * @param testSubsystem The testSubsystem used by this command
   */
  public TestCommand(TestSubsystem testSubsystem) {
    this.testSubsystem = testSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(new Subsystem[] { testSubsystem });
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    testSubsystem.runMotor();
    tickCounter--;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return tickCounter == 0;
  }
}
