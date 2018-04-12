package cn.edu.hqu.javaee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import cn.edu.hqu.javaee.domain.Dessert.*;
import cn.edu.hqu.javaee.domain.Dessert.impl.*;

@Configuration
public class Config {
	@Bean
	@Autowired
	public Consumer consumer(Dessert dessert) {
		return new Child(dessert);
	}
	
	@Bean
	@Primary//没有设置Primary注解就会出现歧义
	public IceCream iceCream() {
		return new IceCream();
	}
	@Bean
	public Cake cake() {
		return new Cake();
	}
	@Bean
	public Popsicle popsicle() {
		return new Popsicle();
	}
}
