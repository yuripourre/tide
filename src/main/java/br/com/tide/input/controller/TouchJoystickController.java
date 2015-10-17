package br.com.tide.input.controller;

import br.com.etyllica.core.input.joystick.TouchJoystick;
import br.com.tide.action.player.ActionPlayer;

public class TouchJoystickController<T> extends TouchJoystick {

	private ActionPlayer<T> player;
	
	public TouchJoystickController(int x, int y) {
		super(x, y);
	}
	
	public TouchJoystickController(int x, int y, int radius) {
		super(x, y, radius);
	}
	
	public TouchJoystickController(int x, int y, int radius, ActionPlayer<T> player) {
		super(x, y, radius);
		this.player = player;
	}

	public ActionPlayer<T> getPlayer() {
		return player;
	}

	public void setPlayer(ActionPlayer<T> player) {
		this.player = player;
	}
	
	@Override
	protected void update() {
		player.setAngle(-angle);
		player.updateAngle();
		
		if(dist > radius/10) {
			
			//Based on speed
			player.walkForward();
		}
	}
	
	@Override
	protected void onReset() {
		player.stopWalkForward();
	}
	
}