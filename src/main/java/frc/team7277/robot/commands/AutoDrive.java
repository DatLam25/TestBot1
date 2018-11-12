package frc.team7277.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7277.robot.Robot;


/**
 * An example command.  You can replace me with your own command.
 */
public class AutoDrive extends Command {

	private double moveValue;
	private double rotateValue;
	public AutoDrive(double moveValue, double rotateValue) {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
		this.moveValue = moveValue;
		this.rotateValue = rotateValue;

	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.driveTrain.autoDrive(moveValue,rotateValue);
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
