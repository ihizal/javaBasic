package com.deep.java.serialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;


class Actor {
	String name;

	Actor() {
		name = "Default";
	}
}

class Hero extends Actor implements Serializable {
	String danceType;

	Hero() {
		danceType = "Default";
	}
}

public class SerializationExamples3 {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		FileOutputStream fileStream = new FileOutputStream("Hero.txt");
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);

		Hero hero = new Hero();
		hero.danceType = "Ganganam";
		hero.name = "Hero1";

		// Before -> DanceType :Ganganam Name:Hero1
		System.out.println("Before -> DanceType :" + hero.danceType + " Name:"
				+ hero.name);
		// Exception in thread "main" java.io.NotSerializableException:
		// com.rithus.serialization.Wall
		objectStream.writeObject(hero);
		objectStream.close();

		FileInputStream fileInputStream = new FileInputStream("Hero.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(
				fileInputStream);
		hero = (Hero) objectInputStream.readObject();
		objectInputStream.close();

		// When subclass is serializable and superclass is not, the state of
		// subclass variables is retained. However, for the super class,
		// initialization
		// constructors and initializers are run again.
		// After -> DanceType :Ganganam Name:Default
		System.out.println("After -> DanceType :" + hero.danceType + " Name:"
				+ hero.name);

		/*List<String> list= Arrays.asList(new String[]{"ac","aases"});
		list.remove();*/
	}
}
