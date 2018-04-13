

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeStructure {
	
	public static void main(String[] args) {
	//	Scanner input = new Scanner(System.in);
		
	//	int n = input.nextInt();
		
		/*int n =5;
		
		List<String> val = new ArrayList<String>();
		String x = "#";
		for (int i=0; i<n; i++) {
			val.add(x);
			x = x.concat("#");
			
		}
		
		System.out.println(val);
		
		String ws = "";
		
		for (int i= 0; i<n; i++) {
			for (int k = i+1; k<n; k++) {
				ws = ws + " ";
				
			}
			
			System.out.println(val.get(i));
			String temp = ws.concat(val.get(i));
			System.out.println("temp :" +temp);
			System.out.println(temp.length());
			ws ="";
			
			//val.set(i, ws.concat(val.get(0)));

		}
		
		
		System.out.println("hello");
		*/
		String text = "12:05:45AM";
		
		System.out.println(text.contains("PM"));
		
		String ybc = "";
		
		if (text.contains("PM") && !text.substring(0, 2).equals("12")) {
			String abc = text.substring(0, 8);
			System.out.println(abc);
			String[] arr = abc.split(":");
			System.out.println(arr[0]);
			int x  = 12 + Integer.parseInt(arr[0]);
			
		
		ybc = String.valueOf(x) + ":"+ arr[1] + ":"+ arr[2];
			
		} else if (text.contains("PM") && text.substring(0, 2).equals("12")) {
			ybc = text.substring(0,8);
		} else if (text.contains("AM") && !text.substring(0, 2).equals("12")) {
			ybc = text.substring(0,8);
		} else if (text.contains("AM") && text.substring(0, 2).equals("12")) {
			ybc = "00:"+text.substring(3, 8);
		}
		
		System.out.println(ybc);
			
		}
			
		
	
		
		
		
			
	
}



