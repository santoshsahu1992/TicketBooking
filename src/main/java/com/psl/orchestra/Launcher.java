package com.psl.orchestra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Beans.xml");

		MusicalInstruments mi_f = (MusicalInstruments) context.getBean("flute");
		mi_f.play();
		MusicalInstruments mi_b = (MusicalInstruments) context.getBean("banjo");
		mi_b.play();
		MusicalInstruments mi_g = (MusicalInstruments) context.getBean("guitar");
		mi_g.play();
	}

}
