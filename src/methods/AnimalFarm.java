package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		for(int i = 0; i>-1;) {
		String animal = "";
		animal = JOptionPane.showInputDialog(null,
				"Enter an animal. (Your choises are cow, duck, dog, cat and llama) ");
		if (animal.equalsIgnoreCase("cow")) {
			playMoo();
		}
		else if (animal.equalsIgnoreCase("duck")) {
			playQuack();
		}
		else if (animal.equalsIgnoreCase("dog")) {
		playWoof();
	}
		else if (animal.equalsIgnoreCase("cat")) {
		playCat();
	}
		else if (animal.equalsIgnoreCase("llama")) {
		playLlama();
	}
		else
			JOptionPane.showMessageDialog(null, "ERROR 404 - The string \"" + animal + "\" cannot be found");
		}
	}
	/* 2. Make it so that the user can keep entering new animals. */

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playCat() {
		playNoise(meowFile);	
	}
	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
