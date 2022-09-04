package chapters.chapter04;

public class exercise06 {

	public static void main(String[] args) {
		//Random points on a circle.
		
		double r = 40;
		System.out.println("Thee random points are: ");
		
		double angle = Math.random() * 360;
		double x = r * Math.cos(angle * Math.PI / 180);
		double y = r * Math.sin(angle * Math.PI / 180);
		System.out.println("(" + x + " , " + y + " )");
		
		angle = Math.random() * 360;
		x = r * Math.cos(angle * Math.PI / 180);
		y = r * Math.sin(angle * Math.PI / 180);
		System.out.println("(" + x + " , " + y + ")");
		
		angle = Math.random() * 360;
		x = r * Math.cos(angle * Math.PI / 180);
		y = r * Math.sin(angle * Math.PI / 180);
		System.out.println("(" + x + " , " + y + ")");

	}

}
