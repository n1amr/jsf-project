package com.n1amr.learn.jsf.numberquiz.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class ProblemBean implements Serializable {
	private ArrayList<Integer> sequence;
	private int solution;

	public ProblemBean() {
	}

	public ProblemBean(int[] values, int solution) {
		sequence = new ArrayList<Integer>();
		for (int i : values)
			sequence.add(i);

		this.solution = solution;
	}

	public ArrayList<Integer> getSequence() {
		return sequence;
	}

	public void setSequence(ArrayList<Integer> sequence) {
		this.sequence = sequence;
	}

	public int getSolution() {
		return solution;
	}

	public void setSolution(int solution) {
		this.solution = solution;
	}
}
