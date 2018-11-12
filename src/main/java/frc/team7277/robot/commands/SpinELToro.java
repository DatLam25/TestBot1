package frc.team7277.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team7277.robot.Robot;


/**
 * An example command.  You can replace me with your own command.
 */
public class SpinELToro extends Command {
	private double direction;

	public SpinELToro(double direction) {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.eltoro);
		this.direction = direction;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.eltoro.spin(direction);
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


}
