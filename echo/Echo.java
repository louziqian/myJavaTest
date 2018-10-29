import java.util.Scanner;
public class Echo{
	public static void main(String[] args){
	String mesg;
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter a line of text:");
	mesg = scan.nextLine();
	System.out.println("You entered :"+mesg);

}


}
