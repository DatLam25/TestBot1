package frc.team7277.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7277.robot.Robot;


/**
 * An example command.  You can replace me with your own command.
 */
public class DriveWithJoystick extends Command {
	public DriveWithJoystick() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.driveTrain.arcadeDriving(Robot.m_oi.getJoystick());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.driveTrain.autoDrive(0,0);
	}

}
