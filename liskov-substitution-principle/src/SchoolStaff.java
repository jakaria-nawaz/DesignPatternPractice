
public class SchoolStaff {
	private void makeAnnouncement() {
		System.out.println("Made Announcements...");
	}
	
	private void takeAttendence() {
		System.out.println("Took Attendence...");
	}
	
	private void collectPaperWork() {
		System.out.println("Collected Papers...");
	}
	private void conductHallwayDuties() {
		System.out.println("Conducted Hallway Duties...");
	}
	
	public void performOtherResponsibilities() {
		makeAnnouncement();
		takeAttendence();
		collectPaperWork();
		conductHallwayDuties();
		// performOtherResponsibilities()
	}
}
