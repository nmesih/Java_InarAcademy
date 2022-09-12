package chapter.Chapter_05;

public class C05E04 {

	public static void main(String[] args) {
		int miles = 1;
		double km;
		System.out.println("Miles\t\tKilometers");
		miles = 1;
		while (miles < 11) {
			km = miles * 1.609;
			System.out.println(miles + "\t\t" + km);
			miles++;
	}

}
}	