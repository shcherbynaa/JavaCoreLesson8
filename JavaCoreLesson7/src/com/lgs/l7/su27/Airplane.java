package com.lgs.l7.su27;

public abstract class Airplane {

	private double length;
	private double width;
	private double weight;

	RandomNumber random = new RandomNumber();

	public Airplane(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public double startEngine() {
		return random.generateCoordinate(20, 80);
	}

	public double takeOff() {
		return random.generateCoordinate(0, 1001);
	}

	public void landing() {
		System.out.println("Airplane is landing");
	}
}
