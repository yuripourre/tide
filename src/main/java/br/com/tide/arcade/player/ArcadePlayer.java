package br.com.tide.arcade.player;

import br.com.tide.PlayerState;
import br.com.tide.common.ActivePlayer;
import br.com.tide.input.ControllerListener;

public class ArcadePlayer<T> extends ActivePlayer<T> implements ControllerListener {

	protected ArcadePlayerListener<T> listener;
	
	public ArcadePlayer() {
		super();
	}
	
	public ArcadePlayer(ArcadePlayerListener<T> listener) {
		super();
		
		this.listener = listener;
	}

	public void walkLeft() {
		x -= currentSpeed;
		
		listener.onWalkLeft(this);	
		states.add(PlayerState.WALK_LEFT);
	}

	public void stopWalkLeft() {
		states.remove(PlayerState.WALK_LEFT);
		listener.onStopWalkLeft(this);
	}

	public void walkRight() {
		x += currentSpeed;
		
		listener.onWalkRight(this);
		states.add(PlayerState.WALK_RIGHT);
	}

	public void stopWalkRight() {
		states.remove(PlayerState.WALK_RIGHT);
		listener.onStopWalkRight(this);
	}

	public void walkUp() {
		y -= currentSpeed;
		
		listener.onWalkUp(this);
		states.add(PlayerState.WALK_UP);
	}

	public void stopWalkUp() {
		states.remove(PlayerState.WALK_UP);
		listener.onStopWalkUp(this);
	}

	public void walkDown() {
		y += currentSpeed;
		
		listener.onWalkDown(this);
		states.add(PlayerState.WALK_DOWN);
	}

	public void stopWalkDown() {
		states.remove(PlayerState.WALK_DOWN);
		listener.onStopWalkDown(this);
	}
	
	public void stopWalk() {
		states.remove(PlayerState.WALK_UP);
		states.remove(PlayerState.WALK_DOWN);
		states.remove(PlayerState.WALK_LEFT);
		states.remove(PlayerState.WALK_RIGHT);		
	}
	
	@Override
	public void attack() {
		super.attack();
		listener.onAttack(this);
	}
	
	public boolean isWalking() {
		return states.contains(PlayerState.WALK_RIGHT)||states.contains(PlayerState.WALK_LEFT)||states.contains(PlayerState.WALK_UP)||states.contains(PlayerState.WALK_DOWN);
	}
	
	public void onUpButtonPressed() {
		walkUp();
	}

	@Override
	public void onUpButtonReleased() {
		stopWalkUp();
	}

	@Override
	public void onDownButtonPressed() {
		walkDown();
	}

	@Override
	public void onDownButtonReleased() {
		stopWalkDown();
	}

	@Override
	public void onRightButtonPressed() {
		walkRight();
	}

	@Override
	public void onRightButtonReleased() {
		stopWalkRight();
	}

	@Override
	public void onLeftButtonPressed() {
		walkLeft();
	}

	@Override
	public void onLeftButtonReleased() {
		stopWalkLeft();
	}

	@Override
	public void onAButtonPressed() {
		attack();
	}

	public void onAButtonReleased() {
		stopAttack();
		stand();	
	}

	public void onBButtonPressed() {
		specialAttack();
	}

	public void onBButtonReleased() {
		onStopSpecialAttack();
		stand();	
	}

	public void onCButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	public void onCButtonReleased() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onXButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onXButtonReleased() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onYButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onYButtonReleased() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onZButtonPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onZButtonReleased() {
		// TODO Auto-generated method stub
		
	}

}
