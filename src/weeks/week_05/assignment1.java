package weeks.week_05;

public class assignment1 {

	public static void main(String[] args) {
		toUpperCase();
		toLowerCase();
		charAt(); 
		trim();
		contains();
		equalsIgnoreCase();
		substring();
		length();
		
	}
		public static void toUpperCase() {
			String temp = "Hello Inar";
			System.out.println("toUpperCase:");
			System.out.println(temp.toUpperCase());	
		}
		public static void toLowerCase() {
			String temp = "Hello Inar";
			System.out.println("toLowerCase:");
			System.out.println(temp.toLowerCase());	
		}

		public static void charAt() {
			System.out.println("charAt: ");
			String temp = "Hello Inar";
			System.out.println(temp.charAt(2));
		}
		public static void trim() {
			System.out.println("trim:");
			String temp = "     Hello  Inar  ";
			System.out.println(temp.trim());
		}
		public static void contains() {
			System.out.println("contains:");
			String temp = "Hello Inar";
			String b = "Inar";
			System.out.println(temp.contains(b));
	}
		public static void equalsIgnoreCase() {
			System.out.println("equalsIgnoreCase:");
			String temp = "Hello Java";
			String b = "Hi Java";
			System.out.println(temp.equalsIgnoreCase(b));
		}
		public static void substring() {
			System.out.println("substring:");
			String temp = "Hello Java";
			String a = temp.substring(2, 5);
			System.out.println(temp);
			System.out.println(a);
			
		}
		public static void length(){
			System.out.println("length:");
			String temp = "I love coding";
			
			int length = temp.length();
			System.out.println(length);
			
	}

}
