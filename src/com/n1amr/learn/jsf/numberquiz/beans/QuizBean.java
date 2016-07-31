package com.n1amr.learn.jsf.numberquiz.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class QuizBean implements Serializable {
	private ArrayList<ProblemBean> problems = new ArrayList<ProblemBean>();
	private int currentIndex;
	private int score;

	public QuizBean() {
		problems.add(new ProblemBean(new int[]{3, 1, 4, 1, 5}, 9));
		problems.add(new ProblemBean(new int[]{1, 1, 2, 3, 5}, 8));
		problems.add(new ProblemBean(new int[]{1, 4, 9, 16, 25}, 36));
		problems.add(new ProblemBean(new int[]{2, 3, 5, 7, 11}, 13));
		problems.add(new ProblemBean(new int[]{1, 2, 4, 8, 16}, 32));
	}

	public ArrayList<ProblemBean> getProblems() {
		return problems;
	}

	public void setProblems(ArrayList<ProblemBean> problems) {
		this.problems = problems;
		currentIndex = 0;
		score = 0;
	}

	public int getCurrentIndex() {
		return currentIndex;
	}

	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ProblemBean getCurrent() {
		return problems.get(currentIndex);
	}

	public String getAnswer() {
		return "";
	}

	public void setAnswer(String newValue) {
		try {
//			if (currentIndex == 0)
//				conversation.begin();
			int answer = Integer.parseInt(newValue.trim());
			if (getCurrent().getSolution() == answer) score++;
			currentIndex = (currentIndex + 1) % problems.size();
			if (currentIndex == 0)
				score = 0;
		} catch (NumberFormatException ex) {
		}
	}
}
