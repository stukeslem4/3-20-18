import java.util.Scanner;
public class MovieT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Movie A=new Movie("IT","Horror",4);	
Movie B=new Movie("The Goonies","Adventure",4);		
Movie C=new Movie("Step Brothers","Comedy",3);	
Movie D=new Movie("The Dark Knight","Action",5);		
Movie E=new Movie("Tower Height","Action",3);	
	
Scanner Y=new Scanner(System.in);	
System.out.println("Enter a rating");
int P=Y.nextInt();
	
if(P==3){	
System.out.println(C.Name);	
System.out.println(E.Name);}

else if(P==4){
	System.out.println(A.Name);	
	System.out.println(B.Name);}
	
else if(P==5){
	System.out.println(D.Name);
}

else{
	System.out.println("Try Again");
}

System.out.println("Enter a genre");
int AC=Y.nextInt();

if(AC==1){
	System.out.println(D.Name);
	System.out.println(E.Name);
}

else if(AC==2){	
System.out.println(C.Name);	
}

else if(AC==3){	
	System.out.println(B.Name);}
	
else if(AC==4){
	System.out.println(A.Name);
}

else{
	System.out.println("Try Again");
}



	}
	
}
