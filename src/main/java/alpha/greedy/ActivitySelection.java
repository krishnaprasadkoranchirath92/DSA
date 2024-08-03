package alpha.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

	public static void main(String[] args) {
		int start[] = { 1, 3, 0, 5, 8, 5 };
		int end[] = { 2, 4, 6, 7, 9, 9 };
		selectMaxAcivity(start, end);
		selectMaxActivityWithSorting(start, end);
	}

	private static void selectMaxActivityWithSorting(int[] start, int[] end) {
		int sortedActivities[][] = new int[end.length][3];
		for (int i = 0; i < end.length; i++) {
			sortedActivities[i][0] = i;
			sortedActivities[i][1] = start[i];
			sortedActivities[i][2] = end[i];
		}
		Arrays.sort(sortedActivities, Comparator.comparingDouble(i -> i[2]));
		List<Integer> selectedActivities = new ArrayList<>();
		int activityCount = 0;
		int lastEnd = sortedActivities[0][2];
		selectedActivities.add(sortedActivities[0][0]);
		activityCount++;
		for (int i = 1; i < sortedActivities.length; i++) { 
			if (sortedActivities[i][1] >= lastEnd) {
				selectedActivities.add(sortedActivities[i][0]);
				activityCount++;
				lastEnd = sortedActivities[i][2];
			}
		}
		System.out.println("Max Number of activities = " + activityCount);
		selectedActivities.forEach(act -> System.out.println("A-" + act));
	}

	private static void selectMaxAcivity(int[] start, int[] end) {
		List<Integer> selectedActivities = new ArrayList<>();
		int activityCount = 0;
		selectedActivities.add(0);
		activityCount++;
		int lastEnd = end[0];
		for (int i = 1; i < end.length; i++) {
			if (lastEnd <= start[i]) {
				activityCount++;
				selectedActivities.add(i);
				lastEnd = end[i];
			}
		}
		System.out.println("Max Number of activities = " + activityCount);
		selectedActivities.forEach(act -> System.out.println("A-" + act));
	}
}
