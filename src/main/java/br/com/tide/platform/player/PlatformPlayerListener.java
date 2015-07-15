package br.com.tide.platform.player;

public interface PlatformPlayerListener<T> {

	public void onTurnLeft(PlatformPlayer<T> player);
	
	public void onTurnRight(PlatformPlayer<T> player);
	
	public void onWalkLeft(PlatformPlayer<T> player);
		
	public void onWalkRight(PlatformPlayer<T> player);
		
	public void onLookUp(PlatformPlayer<T> player);
	
	public void onStandDown(PlatformPlayer<T> player);
	
	public void onJump(PlatformPlayer<T> player);
	
	public void onFall(PlatformPlayer<T> player);
	
	public void onRun(PlatformPlayer<T> player);
	
	public void onStopWalkLeft(PlatformPlayer<T> player);
	
	public void onStopWalkRight(PlatformPlayer<T> player);
	
	public void onStopLookUp(PlatformPlayer<T> player);
	
	public void onStopStandDown(PlatformPlayer<T> player);
	
	public void onStopJump(PlatformPlayer<T> player);
	
	public void onStopRun(PlatformPlayer<T> player);
	
}
