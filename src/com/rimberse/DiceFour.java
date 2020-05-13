package com.rimberse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class DiceFour extends DrawPanel {
	private static final long serialVersionUID = -5411092315776790017L;

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		RenderingHints qualityHints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		qualityHints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2.setRenderingHints(qualityHints);

		g2.setColor(Color.black);
//		g.fillRect(x - 3, y - 3, wdR + 6, htR + 6);
		g2.fill(new RoundRectangle2D.Double(x - 3, y - 3, wdR + 6, htR + 6, arcW, arcH));
		g2.setColor(Color.white);
		g2.fill(new RoundRectangle2D.Double(x, y, wdR, htR, arcW, arcH));
//		g.fillRect(x, y, wdR, htR);

		g.setColor(Color.red);
		g.fillOval(getTopLeftX(wdR, wdC, x), getTopLeftY(htR, htC, y), wdC, htC);

		g.setColor(Color.red);
		g.fillOval(getTopRightX(wdR, wdC, x), getTopRightY(htR, htC, y), wdC, htC);

		g.setColor(Color.red);
		g.fillOval(getBottomLeftX(wdR, wdC, x), getBottomLeftY(htR, htC, y), wdC, htC);

		g.setColor(Color.red);
		g.fillOval(getBottomRighttX(wdR, wdC, x), getBottomRighttY(htR, htC, y), wdC, htC);
	}
}