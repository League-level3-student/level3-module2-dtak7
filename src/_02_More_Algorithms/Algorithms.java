package _02_More_Algorithms;

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
		int largest = 0;
		int contestant = 0;
		for (int i = 0; i < peeps.size(); i++) {
			contestant = i;
			if (contestant > largest) {
				contestant = largest;
			}
		}
		return largest;
	}
}
