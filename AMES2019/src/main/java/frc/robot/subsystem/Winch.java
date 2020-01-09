package frc.robot.subsystem;
import frc.robot.biblioteca.*;

class Winch extends RoboBaseClass {
    public Motor winchMotor;
    private double speed;
    public Winch(Motor motor) {
        super();
        winchMotor = motor;
    }
    @Override
    public void gatherInfo() {
        
    }
    @Override
    public void doActions() {
        winchMotor.set(speed);
    }
    public void setSpeed(double s) {
        speed = s;
    }
}