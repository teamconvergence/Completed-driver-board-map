package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static int p_xbox1 = 0;
	public static int p_driverBoard1 = 1;
	public static int p_driverBoard2 = 2;

	// DriveTrain Motors
	public static int p_leftDrive1 = 10;
	public static int p_leftDrive2 = 11;
	public static int p_rightDrive1 = 12;
	public static int p_rightDrive2 = 13;// this is supposed to be 13
	public static int p_solenoidIn = 3;
	public static int p_solenoidOut = 4;
	public static int p_compressor = 0; // PCM module only works when assigned 0 (previously tried 5)
	public static int p_limitleft = 0;
	public static int p_limitright = 1;
	public static int p_photoeye = 2;
	public static int p_gyroscope = 0;
	public static int p_liftmotor = 73;
	public static int p_wristmotor = 0;
	// public static int p_encoderchannel1 = 0;
	// public static int p_encoderchannel2 = 0;
	// public static int p_secondencoderchannel1 = 2;
	// public static int p_secondencoderchannel2 = 2;
	public static int p_turn45 = 3; // game board 2
	public static int p_turn90 = 7; // game board 2 ?
	public static int p_turn180 = 4; // 2
	public static int p_cargo1 = 4; // 1
	public static int p_cargo2 = 5; // 1
	public static int p_cargo3 = 7; // 1
	public static int p_panel1 = 3; // 1
	public static int p_panel2 = 6; //1
	public static int p_panel3 = 4; //2
	public static int p_floor = 1; //1
	public static int p_panelout = 4; //2
	public static int p_panelin = 1; //2
	public static int p_cargoout = 2; //1
	public static int p_cargoin = 0; //1
	public static int p_punch = 0; //2

}

