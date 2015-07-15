package br.com.tide.arcade.player;

public interface ArcadePlayerListener<T> {

	public void onWalkLeft(ArcadePlayer<T> player);
	
	public void onWalkRight(ArcadePlayer<T> player);
	
	public void onWalkUp(ArcadePlayer<T> player);
	
	public void onWalkDown(ArcadePlayer<T> player);
	
	public void onStopWalkLeft(ArcadePlayer<T> player);
	
	public void onStopWalkRight(ArcadePlayer<T> player);
	
	public void onStopWalkUp(ArcadePlayer<T> player);
	
	public void onStopWalkDown(ArcadePlayer<T> player);
	
	public void onAttack(ArcadePlayer<T> player);
		
}
