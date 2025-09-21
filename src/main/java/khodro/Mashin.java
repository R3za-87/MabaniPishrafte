package khodro;

public class Mashin {
    boolean ayaRoshanAst; // false
    boolean ayaDarBazAst; // false
    String mark;
    Ranande ranande;

    public Mashin() {
    }

    public Mashin(String mark) {
        this.mark = mark;
    }

    public void roshan() {
        ayaRoshanAst = true;
    }

    void khamosh() {
        ayaRoshanAst = false;
    }

    void bazKardanDar() {
        ayaDarBazAst = true;
    }

    void basatanDar() {
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        } else {
            return false;
        }
    }
}
