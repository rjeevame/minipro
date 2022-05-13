package Interface;

public class Student1 implements College_Details, Hostel_Details {

	@Override
	public void brances() {
		System.out.println("5 brances");
	}
	@Override
	public void classrooms() {
		System.out.println("Classroom with AC");
	}
	@Override
	public void placements() {
		System.out.println("100% placement");		
	}
	@Override
	public void canteen_Facilities() {
		System.out.println("With pay");
	}
	@Override
	public void hostel_fee() {
		System.out.println("Rs.60000 per year");
	}
	@Override
	public void food_variety() {
		System.out.println("Both veg & Non-veg");
	}
	
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.brances();
		s.classrooms();
		s.placements();
		s.canteen_Facilities();
		s.hostel_fee();
		s.food_variety();
	}
}
