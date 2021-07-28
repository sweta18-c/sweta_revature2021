package web;

public class WebSecure {

	public static void main(String[] args) {
		String A = " https://en.wikipedia.org/wiki/Main_page";
		System.out.println(WebSec(A));
	}
	public static boolean WebSec(String s){
		boolean b=true;
		if(s.startsWith("http"))
		{
			b =false;
		}
		return b;
	}

}
