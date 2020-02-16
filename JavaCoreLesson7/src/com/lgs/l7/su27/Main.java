package com.lgs.l7.su27;

public class Main {

	public static void main(String[] args) {

		SU27 su = new SU27(12, 7, 1250, 2500, "grey");
		System.out.println("We are starting the engine: " + su.startEngine());
		System.out.println("Engine started");
		System.out.println("Take off! " + su.takeOff());
		System.out.println("Engine started");

		AirplaneControl control = new AirplaneControl();

		System.out.println("Move left on " + control.moveLeft() + "km");
		System.out.println("Move up on " + control.moveUp() + "km");
		System.out.println("Move down on " + control.moveDown() + "km");
		System.out.println("Move right on " + control.moveRight() + "km");

		su.stealthTechnology();
		su.nuclearImpact();

		su.turboAcceleration();
		su.landing();
	}
}
