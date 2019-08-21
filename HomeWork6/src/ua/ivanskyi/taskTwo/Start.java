package ua.ivanskyi.taskTwo;

import java.util.HashMap;
import java.util.Map;

public class Start {

	public static void main(String[] args) {

		Map<String, String> person = new HashMap<>();

		person.put("Ostap", "Ivanskyi");
		person.put("Petro", "Sfsdfsd");
		person.put("Ivan", "Cbfgbfbg");
		person.put("Orest", "Qferef");
		person.put("Olena", "Dfdfgd");
		person.put("Chris", "Mknmkmm");
		person.put("Orest", "Ljijiji");
		person.put("Oleh", "Oiouu");
		person.put("Nazar", "Plkjjhn");
		person.put("Andriy", "Qwjjvcx");

		for (Map.Entry<String, String> entry : person.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println();

		person.remove("Orest");

		for (Map.Entry<String, String> entry : person.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
