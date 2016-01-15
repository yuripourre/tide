package br.com.tide.common.listener;

import br.com.tide.common.ActivePlayer;

public interface OnFinishAttackListener<T> {
	void finishAttack(ActivePlayer<T> player);
}
