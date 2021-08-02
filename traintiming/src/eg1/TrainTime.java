package eg1;

public class TrainTime {
	
	public void TrainSchedule(Schedule[] schedule) {
		this.schedule =schedule;
	}
	
	public void printSchedule() {
		System.out.println(" Yasvantpur Delhi Sarau Rohilla AC Duronto Express(12213)")	;
		System.out.println("---------------------------------------------");
		System.out.println("# 	code 	station 	Arr time	dep time");
		System.out.println("---------------------------------------------");
		
		for(Schedule x: schedule) {
			x.printTime();
		}
		System.out.println("---------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schedule schedule[]= {
				new Schedule(1,"YPR", "Yasvantapur","","23.40");
				new Schedule(1,"YPR", "Yasvantapur","","23.40");
				new Schedule(1,"YPR", "Yasvantapur","","23.40");
				new Schedule(1,"YPR", "Yasvantapur","","23.40");
				new Schedule(1,"YPR", "Yasvantapur","","23.40");
		}
	}
	
}
