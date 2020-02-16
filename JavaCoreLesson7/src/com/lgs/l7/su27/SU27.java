package com.lgs.l7.su27;

public class SU27 extends Airplane implements Technologies {

	private double maxSpeed;
	private String color;

	public SU27(double length, double width, double weight, double maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	RandomNumber random = new RandomNumber();

	@Override
	public void turboAcceleration() {
		System.out.println(random.generateCoordinate(0, 2500) + 2500);
		System.out.println("TurboAcceleration is Aktive");
	}

	@Override
	public void stealthTechnology() {
		System.out.println("The plane is not visible");
	}

	@Override
	public void nuclearImpact() {
		System.out.println("The number of nuclear warheads to be dropped " + random.generateCoordinate(0, 11));
	}
}
