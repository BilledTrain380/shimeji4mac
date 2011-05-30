package com.group_finity.mascot.mac;

import java.awt.Point;

import com.group_finity.mascot.environment.Area;
import com.group_finity.mascot.environment.Environment;

/**
 * Java では取得が難しい環境情報をJNIを使用して取得する.
 */
class MacEnvironment extends Environment {

	private static Area activeIE = new Area();

	@Override
	public void tick() {
		super.tick();
		this.activeIE.setVisible(false);
	}

	@Override
	public void moveActiveIE(final Point point) {
	}

	@Override
	public void restoreIE() {

	}

	@Override
	public Area getWorkArea() {
		return getScreen();
	}

	@Override
	public Area getActiveIE() {
		return this.activeIE;
	}

}
