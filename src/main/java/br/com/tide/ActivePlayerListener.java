package br.com.tide;


public interface ActivePlayerListener<T> {

	public void onAttack();
	
	public void onStopAttack();
	
	public void onSpecialAttack();
	
	public void onStopSpecialAttack();
	
	public void onBeignHit(ActivePlayer<T> attacker);
	
	public void onStand();
	
	public void onDie();
	
}
