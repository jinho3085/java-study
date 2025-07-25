package com.bit2025.paint.text;

import com.bit2025.paint.main.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	public GraphicText(String text) {
		this.text = text;
	}
	
	@Override
	public void draw() {
		System.out.println("텍스트 '" + text + "'를 그렸습니다.");
	}

}
