package com.lgs.l7.su27;

import java.util.Random;

public class RandomNumber {

	Random random = new Random();

	public double generateCoordinate(double min, double max) {
		return (min + random.nextDouble() * (max - min));
	}

	public static void main(String[] args) {
		RandomNumber r = new RandomNumber();
		System.out.println("de");
		double d = r.generateCoordinate(20, 80);
		System.out.println(d);
	}
}
