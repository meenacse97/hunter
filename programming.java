package guvi;
import java.util.*;
public class programming {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String a=s.next();
		System.out.println("input length:");
		int l=s.nextInt();
		System.out.println("subsets are:");
		for(int i=0;i<a.length();i++){
		for(int j=i+1;j<a.length();j++){
			System.out.print(a.substring(i,l-1));
			System.out.println(a.charAt(j));
		}
		break;
		}
	}

}
