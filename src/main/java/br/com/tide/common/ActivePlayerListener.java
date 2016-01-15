package br.com.tide.common;


public interface ActivePlayerListener<T> {

	public void onAttack();
	
	public void onFinishAttack();
	
	public void onStopAttack();
	
	public void onSpecialAttack();
	
	public void onStopSpecialAttack();
	
	public void onBeignHit(ActivePlayer<T> attacker);
	
	public void onStand();
	
	public void onDie();
	
}
