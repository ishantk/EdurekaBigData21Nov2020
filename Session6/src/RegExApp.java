import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExApp {

	public static void main(String[] args) {
		
		/*String regex = "[a-z]+";
		String text = "Happy Learning! Welcome to Edureka";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(text.substring(matcher.start(), matcher.end()));
		}*/
		
		String regex = "\\bthe\\b";
		String text = "Search the candle rather than cursing the darkness";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println("Pattern Matched: "+matcher.group()+" at index "+matcher.start()+" finish index: "+matcher.end());
		}
		
		// Assignment: Create a RegEx to validate if number if a correct vehicle number
		// 					    cc dd cc dddd 
		String vehicleNumber = "PB10AB1234";

	}

}
