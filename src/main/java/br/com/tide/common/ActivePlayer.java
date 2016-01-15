package br.com.tide.common;

import br.com.etyllica.core.Updatable;
import br.com.tide.Player;
import br.com.tide.PlayerState;

public class ActivePlayer<T> extends Player<T> implements Updatable, ActivePlayerListener<T> {
	
	protected float health = 100;
	protected int walkSpeed = 5;
	protected int currentSpeed = 5;
	
	protected long hitStart = 0;
	protected long hitDelay = 200;
	
	protected long attackStart = 0;
	protected long attackDelay = 0;
	
	public void update(long now) {
		if(isBeignHit()) {
			if(now-hitStart>hitDelay) {
				this.stand();
			}
		} else if(isAttacking()) {
			if(now-attackStart>attackDelay) {
				onFinishAttack();
			}
		}
	}
	
	public void stand() {
		states.clear();
		states.add(PlayerState.STAND);
		onStand();
	}
	
	public void attack() {
		attackStart = System.currentTimeMillis();
		states.clear();
		states.add(PlayerState.ATTACK);
		onAttack();
	}
	
	public void attack(long delay) {
		attack();
		this.attackDelay = delay;
	}
	
	public void specialAttack() {
		states.clear();
		states.add(PlayerState.SPECIAL_ATTACK);
		onSpecialAttack();
	}

	public void beignHit(ActivePlayer<T> who, long when) {
		states.clear();
		states.add(PlayerState.BEING_HIT);
		onBeignHit(who);

		hitStart = when;
	}

	public void stopAttack() {
		this.stand();
		onStopAttack();
	}
	
	public void die() {
		states.clear();
		states.add(PlayerState.DEAD);
		onDie();
	}
	
	public boolean isAttacking() {
		return states.contains(PlayerState.ATTACK);
	}

	public boolean isStanding() {
		return states.contains(PlayerState.STAND);
	}
	
	public boolean isDead() {
		return states.contains(PlayerState.DEAD);
	}

	public boolean isBeignHit() {
		return states.contains(PlayerState.BEING_HIT);
	}
	
	//Listener Methods
	public void onAttack() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onFinishAttack() {
		stopAttack();
	}

	public void onStopAttack() {
		// TODO Auto-generated method stub
	}
	
	public void onSpecialAttack() {
		// TODO Auto-generated method stub
	}

	public void onStopSpecialAttack() {
		// TODO Auto-generated method stub
	}

	public void onStand() {
		// TODO Auto-generated method stub
	}

	public void onBeignHit(ActivePlayer<T> attacker) {
		// TODO Auto-generated method stub
	}

	public void onDie() {
		// TODO Auto-generated method stub
	}
	
	//Common Actions
	public void walkAction() {
		
	}
	
	public void jumpAction() {
		
	}
}
