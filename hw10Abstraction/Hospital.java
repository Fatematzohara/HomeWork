package hw10Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public void morgue();// default method

	public static void pharmacy() {
	};// static mathod

}
