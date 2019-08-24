package ua.ivanskyi.two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {

	public static void main(String[] args) {
		String sentence = "I  am         learning       Java  Core";

		System.out.println(sentence);

		String pattern = "\\w+\\s?";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);

		while (m.find()) {
			System.out.print(sentence.substring(m.start(), m.end()));
		}

	}

}
