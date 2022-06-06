package com.confiz.bridge.pattern;

public class ShortFormVIew extends View {
	
	public ShortFormVIew(IResource view){
		super(view);
	}

	@Override
	public String show() {
		return "{" + "title:" + resource.title() + ", image:" + resource.image() + "}";
	}

}
