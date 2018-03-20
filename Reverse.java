import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Q=new Scanner(System.in);
	System.out.println("Type a word");
	String H=Q.nextLine();
	
	int J;	
	for(J=H.length()-1;J>=0;J--){
		System.out.println(H.charAt(J));
	}
	
	
	
		
	}

}
