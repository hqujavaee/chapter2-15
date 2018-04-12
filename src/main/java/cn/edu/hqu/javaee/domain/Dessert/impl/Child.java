package cn.edu.hqu.javaee.domain.Dessert.impl;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Dessert;


public class Child implements Consumer {
	Dessert dessert;
	public Child(Dessert dessert) {
		this.dessert=dessert;
	}

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		dessert.eat();
	}
}
