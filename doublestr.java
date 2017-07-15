package guvi;
import java.util.*;
public class doublestr {
	public static void main(String[] args){
		String a;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		int l=a.length();
		String s1=a.substring(0,l/2);
		//System.out.println(s1);
		String s2=a.substring(l/2);
		//System.out.println(s2);
		if(s1.equals(s2)){
			System.out.println(a+"is a double string");
		}
		else{
			System.out.println(a+" is a not a double string");
		}
	}

}
