package com.rimberse;

import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class DrawPanel extends JPanel {
	private static final long serialVersionUID = -1331121772224423587L;

	int wdR = 150;
	int htR = 150;

	int wdC = 38;
	int htC = 38;

	int x = 20;
	int y = 10;

	int arcW = 50;
	int arcH = 50;

	public abstract void paintComponent(Graphics g);
//	 g.setColor(Color.black);
//	 g.drawRect(x, y, wd, ht);

	public int getTopLeftX(int w1, int w2, int x) {
		int posX = ((w1 - 125) - (w2 / 2)) + x;
		return posX;
	}

	public int getTopLeftY(int h1, int h2, int y) {
		int posY = ((h1 - 125) - (h2 / 2)) + y;
		return posY;
	}

	public int getTopRightX(int w1, int w2, int x) {
		int posX = ((w1 - 25) - (w2 / 2)) + x;
		return posX;
	}

	public int getTopRightY(int h1, int h2, int y) {
		int posY = ((h1 - 125) - (h2 / 2)) + y;
		return posY;
	}

	public int getMiddleLeftX(int w1, int w2, int x) {
		int posX = ((w1 - 125) - (w2 / 2)) + x;
		return posX;
	}

	public int getMiddleLeftY(int h1, int h2, int y) {
		int posY = ((h1 / 2) - (h2 / 2)) + y;
		return posY;
	}

	public int getMiddleCenterX(int w1, int w2, int x) {
		int posX = ((w1 / 2) - (w2 / 2)) + x;
		return posX;
	}

	public int getMiddleCenterY(int h1, int h2, int y) {
		int posY = ((h1 / 2) - (h2 / 2)) + y;
		return posY;
	}

	public int getMiddleRightX(int w1, int w2, int x) {
		int posX = ((w1 - 25) - (w2 / 2)) + x;
		return posX;
	}

	public int getMiddleRightY(int h1, int h2, int y) {
		int posY = ((h1 / 2) - (h2 / 2)) + y;
		return posY;
	}

	public int getBottomLeftX(int w1, int w2, int x) {
		int posX = ((w1 - 125) - (w2 / 2)) + x;
		return posX;
	}

	public int getBottomLeftY(int h1, int h2, int y) {
		int posY = ((h1 - 25) - (h2 / 2)) + y;
		return posY;
	}

	public int getBottomRighttX(int w1, int w2, int x) {
		int posX = ((w1 - 25) - (w2 / 2)) + x;
		return posX;
	}

	public int getBottomRighttY(int h1, int h2, int y) {
		int posY = ((h1 - 25) - (h2 / 2)) + y;
		return posY;
	}
}