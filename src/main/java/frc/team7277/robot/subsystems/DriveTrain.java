
package frc.team7277.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import frc.team7277.robot.commands.DriveWithJoystick;


public class DriveTrain extends Subsystem {
	//Creating the motor Controllers
	private WPI_TalonSRX tx_rghtFront = new WPI_TalonSRX(2);
	private  WPI_TalonSRX tx_rghtFollower = new WPI_TalonSRX(4);
	private WPI_TalonSRX tx_leftFront = new WPI_TalonSRX(1);
	private  WPI_TalonSRX tx_leftFollower = new WPI_TalonSRX(3);
	private DifferentialDrive m_drive;

	public DriveTrain () {
		m_drive = new DifferentialDrive(tx_leftFront, tx_rghtFront);


		tx_leftFollower.follow(tx_leftFront);
		tx_rghtFollower.follow(tx_rghtFront);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveWithJoystick());
	}

	public void arcadeDriving(Joystick joy){
		m_drive.arcadeDrive(-joy.getY(), joy.getX());
	}

	public void autoDrive(double moveValue, double rotateValue){
		m_drive.arcadeDrive(moveValue, rotateValue);
	}
}
