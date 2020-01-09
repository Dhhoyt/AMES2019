package frc.robot.biblioteca;
 
public class PIDcontrol extends RoboBaseClass{
    double m_error;
    double m_totalError;
    double m_target;
    double m_actual;
    double m_lastActual;
    double m_output;
    double m_P;
    double m_I;
    double m_D;
    double m_Coeff;
    double m_maxValue;
    boolean m_active;
    PIDcontrol(double p, double i, double d){
        super();
        m_P = p;
        m_I = i;
        m_D = d;
        m_active = false;
    }
    public void activate(){
        m_active = true;
    }
    public void stop(){
        m_active = false;
    }
    public boolean isActive(){
        return m_active;
    }
    public void setP(double p){
        m_P = p;
    }
    public double getP(){
        return m_P;
    }
    public void setI(double i){
        m_I = i;
    }
    public double getI(){
        return m_I;
    }
    public void setD(double d){
        m_D = d;
    }
    public double getD(){
        return m_D;
    }
    public void setTarget(double target){
        m_target = target;
    }
    public double getTarget(){
        return m_target;
    }
    public void setActual(double actual){
        m_actual = actual;
    }
    public double getActual(){
        return m_actual;
    }
    public void reset(){
        m_active = false;
        m_totalError = 0;
    }
    @Override
    public void doActions(){
        if(m_active){
            m_error = m_target - m_actual;
            double pOutput;
            double iOutput;
            double dOutput;
            m_totalError =+ m_error;
            pOutput = m_P * m_error;
            iOutput = m_I * m_totalError;
            dOutput = -m_D * (m_actual - m_lastActual);
            m_lastActual = m_actual;
            m_output = m_Coeff * (pOutput + iOutput + dOutput);
        }
    }
    @Override
    public void gatherInfo(){
        
    }
}