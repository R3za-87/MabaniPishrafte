package khodro;

// Motor yek khodro ast : MotorCycle is a Vehicle
public class Motor extends Khodro {

    public boolean ayaDarHaleHarekatAst() {
        return ayaRoshanAst;
    }

    @Override
    public String getMark() {
        return "Motor";
    }
}
