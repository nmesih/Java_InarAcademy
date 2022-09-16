package chapter.Chapter_05;

public class C05E40 {

	public static void main(String[] args) {
		
		String s = "Heads";
		String a = "Tails";
		int h = 0;
		int t = 0;
	
		for(int i = 0; i < 1_000_000;i++) {
			
			int coinFlip = (int)(Math.random()*2);
			
			if(coinFlip == 1) {
				System.out.println(s);
			h++;
			}else {
				System.out.println(a);
			t++;
			}
		}
		System.out.println(h + " " + s + ", " + t + " " + a);
	}

}
