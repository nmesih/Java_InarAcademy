package weeks.week_05;

public class NoDublicate {

	public static void main(String[] args) {
			String str = "Inar Academy";
			String sum = "";
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (sum.contains("" + ch) == false) {
					sum += ch;

				}
			}
			System.out.println(sum);

		}

	}	
