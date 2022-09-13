package chapter.Chapter_05;

public class C05E15 {

	public static void main(String[] args) {
		
		int numb = 0;
		for(char ch1 = '!'; ch1 < 127; ch1++) {
			numb ++;
			System.out.print(ch1 + " ");
			
			if(numb == 10) {
				System.out.println("\n");
				numb = 0;
			}
		}
	}

}
