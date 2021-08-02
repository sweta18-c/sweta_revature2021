package eg1;

public class Time {
	private int num ;
	private String code ;
	private String station;
	private String Arr ;
	private String dep ;
	
	public void Schedule(int num, String code, String station, String Arr, String dep) {
		this.num= num ;
		this.code= code ;
		this.station= station;
		this.Arr= Arr ;
		this.dep= dep ;
	}

	public void printSchedule() {
		System.out.printf("%d %2s %3s %7s %3s\n",num ,code,station,Arr,dep);
	}
}
