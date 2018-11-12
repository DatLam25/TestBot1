
package frc.team7277.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;


public class ELToro extends Subsystem {
	Spark left_Toro = new Spark(3);
	Spark rght_Toro = new Spark(4);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void spin(double direction){
		left_Toro.set(direction);
		rght_Toro.set(direction);
	}
}
