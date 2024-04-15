package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("-----------Regular class ColumbiaUniversity----------");
		ColumbiaUniversity columbia = new ColumbiaUniversity();
		columbia.aeronauticalInfo();
		columbia.anatomyLab();
		columbia.anthropology();
		columbia.biochemistryLab();
		columbia.biology();
		columbia.cafeteria();
		columbia.caring();
		columbia.classSize();
		columbia.commonRoom();
		columbia.computerLab();
		columbia.dorm();
		columbia.emergencyRoom();
		columbia.getClass();
		columbia.gymnasium();
		columbia.hygiene();
		columbia.laboratory();
		columbia.languageClub();
		columbia.lawInfo();
		columbia.maths();
		columbia.mechanicalLab();
		columbia.morgue();
		columbia.playGround();
		columbia.surgeryRoom();
		columbia.teacher();
		columbia.vocationalInfo();

		// University university = new University();
		// University interface cannot be instantiate to create an object.
		// So we cannot call any method by creating university object.

		// MedicalSchool medicalSchool = new MedicalSchool();
		// MedicalSchool abstract class cannot be instantiate to create an object
		// So we cannot call any method by creating MedicalSchool object.

	}
}
