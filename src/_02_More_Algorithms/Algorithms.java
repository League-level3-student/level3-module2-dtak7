package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				return i;
			}
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		double largest = 0;
		double contestant = 0;
		for (int i = 0; i < peeps.size(); i++) {
			contestant = peeps.get(i);
			if (contestant > largest) {
				largest = contestant;
			}
		}
		return largest;
	}

	public static Object findLongestWord(List<String> words) {
		String largest = "";
		String contestant = "";
		for (int i = 0; i < words.size(); i++) {
			contestant = words.get(i);
			if (contestant.length() > largest.length()) {
				largest = contestant;
			}
		}
		return largest;
	}

	public static Object containsSOS(List<String> message1) {
		String hold = "";
		for (int i = 0; i < message1.size(); i++) {
			hold = message1.get(i);
			if (hold.equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static Object sortDNA(List<String> unsortedSequences) {

		return null;
	}

	public static List<String> sortScores(List<Double> results) {
		double one = 0;
		double two = 0;
		List<String> plsSort = new ArrayList<String>();
		for (int i = 0; i < results.size() - 1; i++) {
			for (int j = i + 1; j < results.size(); j++) {
				one = results.get(i);
				two = results.get(j);
				if (one > two) {
					double temp = two;
					one = two;
					two = temp;
					plsSort.add(one + "");
					plsSort.add(two + "");
				}
			}
		}

		List<String> done = new ArrayList<String>();
		for (int i = 0; i < results.size(); i++) {

			done.addAll(plsSort);
		}
		System.out.println(done);
		return done;

	}

}