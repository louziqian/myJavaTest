import java.awt.*;

class AwtDemo{

	public static void main(String args[]){
		try{
			Frame f =  new Frame("Tribbi");
			f.setVisible(true);
		}catch(HeadlessException e){
			System.out.println(e.getMessage());
		}
		int a = 1,b = 1;
		a <<= 31;
		b <<= 31;

		a >>= 31;
		a >>= 1;

		b >>>= 31;
		b >>>= 1;
		System.out.printf("Tribbi"+a+"     "+b);

	}



}
