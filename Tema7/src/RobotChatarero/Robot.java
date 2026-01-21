package RobotChatarero;

public class Robot {
	
	int peso;
	int consumicion;
	Robot(int peso) {
	this.peso=3;
	this.consumicion=1;
	}
	
	void recogida(int piezas) {
		this.peso=(peso-this.consumicion);
	}
	
	void otroRobot(Robot r2) {
	recogida(peso);
	}
}
