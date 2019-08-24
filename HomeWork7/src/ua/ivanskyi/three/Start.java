package ua.ivanskyi.three;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {

	public static void main(String[] args) {

		String pattern = "\\$(\\d{1,3}')*\\d{1,3}(\\.\\d{2})?";
		String sentence = "one - $3'321.65 , two - $4'234'234.23 , three - $23.33  ";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);

		List<String> list = new ArrayList<>();

		while (m.find()) {

			list.add(sentence.substring(m.start(), m.end()));

		}

		System.out.println(list);

	}

}
