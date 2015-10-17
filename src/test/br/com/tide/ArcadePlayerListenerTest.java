package br.com.tide;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tide.arcade.player.ArcadePlayer;
import br.com.tide.arcade.player.ArcadePlayerListener;

public class ArcadePlayerListenerTest {

	private TestPlayer player;
	
	private TestPlayerListener listener;
	
	@Before
	public void setUp() {
		listener = new TestPlayerListener();
		player = new TestPlayer(listener);
	}
	
	@Test
	public void testListenerCall() {
		player.walkLeft();
		Assert.assertEquals("left", player.data.status);
	}
	
	class Model {
		public String status = "Hello";
	}
	
	class TestPlayer extends ArcadePlayer<Model> {

		public String name = "player";
				
		public TestPlayer(TestPlayerListener listener) {
			super();
			this.listener = listener;
			
			data = new Model();
		}
	}
	
	class TestPlayerListener implements ArcadePlayerListener<Model> {
		
		@Override
		public void onWalkLeft(ArcadePlayer<Model> player) {
			Model data = player.data;
			data.status = "left";
		}

		@Override
		public void onWalkRight(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onWalkUp(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onWalkDown(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStopWalkLeft(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStopWalkRight(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStopWalkUp(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStopWalkDown(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onAttack(ArcadePlayer<Model> player) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
