import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class question3 {
	public static void main(String[] args) {
		int n =5; //this way it can cover any arbitrary n
		ArrayList<String> activelist = new ArrayList<String>();
		int i = 0;
		int startingnum = 1;
		while (i < n){
			ArrayList<String> templist1 = new ArrayList<String>(Arrays.asList(new String[n-startingnum]));
			Collections.fill(templist1, ".");
			ArrayList<String> templist2 = new ArrayList<String>(Arrays.asList(new String[startingnum]));
			Collections.fill(templist2, Integer.toString(startingnum));
			activelist.addAll(templist1);
			activelist.addAll(templist2);
			activelist.add("\n");
			startingnum++;
			i++;
		}
		String result = activelist.toString(); //technically I guess this might be a control structure, as there is a loop over in toString
		String result2 = result.replaceAll(",", "");//I really wish Java would let me just go with result=result.replaceAll(foo) but there you go
		String result3 = result2.replaceAll(" ", "");
		String result4 = result3.substring(0, result3.length()-2);
		String result5 = result4.substring(1, result4.length());
		System.out.println(result5);
	}
}
