package br.com.tide.action.player;

public interface ActionPlayerListener<T> {

	public void onFinishAttack(ActionPlayer<T> player);
	
	public void onTurnLeft(ActionPlayer<T> player);
	
	public void onTurnRight(ActionPlayer<T> player);
	
	public void onWalkForward(ActionPlayer<T> player);
	
	public void onWalkBackward(ActionPlayer<T> player);
	
	public void onStopTurnLeft(ActionPlayer<T> player);
	
	public void onStopTurnRight(ActionPlayer<T> player);
	
	public void onStopWalkForward(ActionPlayer<T> player);
	
	public void onStopWalkBackward(ActionPlayer<T> player);
		
}
