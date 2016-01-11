package br.com.tide.ai.planning;

public class PlanningStep<T> {
	
	PlanningAction action;
	
	T data;
	
	public PlanningStep(PlanningAction action, T data) {
		super();
		this.action = action;
		this.data = data;
	}

	public PlanningAction getAction() {
		return action;
	}

	public void setAction(PlanningAction action) {
		this.action = action;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}	
	
}
