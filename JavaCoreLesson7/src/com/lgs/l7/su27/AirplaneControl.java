package com.lgs.l7.su27;

public class AirplaneControl {

	double coordinate;
	RandomNumber randomNumber = new RandomNumber();

	public double moveUp() {
		return randomNumber.generateCoordinate(0, 100);
	}

	public double moveDown() {
		return randomNumber.generateCoordinate(0, 100);
	}

	public double moveRight() {
		return randomNumber.generateCoordinate(0, 100);
	}

	public double moveLeft() {
		return randomNumber.generateCoordinate(0, 100);
	}
}
