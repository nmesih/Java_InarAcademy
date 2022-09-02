package chapter.Chapter_04;

public class C04E06 {

	public static void main(String[] args) {
		System.out.println("Three random points on the circle with radius 40: ");
		double angle1 = Math.random() * (Math.PI * 2);
		double x1 = 40 * Math.cos(angle1);
		double y1 = 40 * Math.sin(angle1);
		System.out.println("( " + x1 + ", " + y1 + ")");
		
		angle1 = Math.random() * (Math.PI * 2);
		x1 = 40 * Math.cos(angle1);
		y1 = 40 * Math.sin(angle1);
		System.out.println("( " + x1 + ", " + y1 + ")");
		
		angle1 = Math.random() * (Math.PI * 2);
		x1 = 40 * Math.cos(angle1);
		y1 = 40 * Math.sin(angle1);
		System.out.println("( " + x1 + ", " + y1 + ")");
	}

}
