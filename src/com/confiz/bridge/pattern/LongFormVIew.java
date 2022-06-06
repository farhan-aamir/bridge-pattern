package com.confiz.bridge.pattern;

public class LongFormVIew extends View {
	
	public LongFormVIew(IResource view){
		super(view);
	}

	@Override
	public String show() {
		return "{" + "title:" + resource.title() + ", snippet:" + resource.snippet() + ", image:" + resource.image() + "}";
	}

}
