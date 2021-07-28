package Mypack1;
import java.util.*;

public class WebsiteName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String url =s.nextLine();
		String urlSplit[]= url.split("/");
		 
		System.out.println(urlSplit[2]); 
		
		s.close();
	}

}
