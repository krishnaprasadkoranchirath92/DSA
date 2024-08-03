package alpha.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSequencingProblem {

	public static void main(String[] args) {
		int[][] jobs = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
		jobSequenceWithoutObj(jobs);
		jobSequence(jobs);
	}

	private static void jobSequence(int[][] jobs) {
		List<Job> jobsList = new ArrayList<>();
		List<Job> seq = new ArrayList<>();
		for (int i = 0; i < jobs.length; i++) {
			jobsList.add(new Job("A-" + i, jobs[i][1], jobs[i][0]));
		}
		Collections.sort(jobsList, (o1, o2) -> o2.getProfit() - o1.getProfit());
		int time = 0;
		for (int i = 0; i < jobsList.size(); i++) {
			Job currJob = jobsList.get(i);
			if (currJob.getDeadline() > time) {
				seq.add(currJob);
				time++;
			}
		}
		seq.forEach(e -> System.out.println(e.getId() + " "));
	}

	private static void jobSequenceWithoutObj(int[][] jobs) {
		Arrays.sort(jobs, (a, b) -> Integer.compare(b[1], a[1]));
		List<int[]> list = new ArrayList<>();
		int time = 1;
		for (int i = 0; i < jobs.length; i++) {
			if (jobs[i][0] >= time) {
				list.add(jobs[i]);
				time++;
			}
		}
		list.forEach(e -> System.out.println(e[0] + " - " + e[1]));

	}

	static class Job {
		String id;
		int profit;
		int deadline;

		public Job(String id, int profit, int deadline) {
			super();
			this.id = id;
			this.profit = profit;
			this.deadline = deadline;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getProfit() {
			return profit;
		}

		public void setProfit(int profit) {
			this.profit = profit;
		}

		public int getDeadline() {
			return deadline;
		}

		public void setDeadline(int deadline) {
			this.deadline = deadline;
		}

	}

}