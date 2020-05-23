import java.util.Scanner;

public class cases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter the subject marks");
System.out.println("Telugu=");
int x=in.nextInt();
System.out.println("Hindi=");
int y=in.nextInt();
System.out.println("English=");
int z=in.nextInt();
System.out.println("Mathematics=");
int p=in.nextInt();
System.out.println("Science=");
int q=in.nextInt();
System.out.println("Social=");
int r=in.nextInt();
int totalmarks=x+y+z+p+q+r;
System.out.println(totalmarks);
 int Average=totalmarks*100/600;
switch	((Average>=90)?0:
		(Average<90&&Average>80)?1){
	case 0:
		System.out.println( "excellent");
	break;
	case 1:
	System.out.println("good");
	break;
	case 2:
	System.out.println("fail");
	break;
	
}

	}

}
