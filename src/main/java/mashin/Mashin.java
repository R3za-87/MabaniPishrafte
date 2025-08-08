package mashin;

import static java.lang.System.out;

public class Mashin {
    //Dade :
    boolean ayaMashinRoshanAst; // false
    boolean ayaDarMashinBazAst; // false
    String mark;
    Ranande ranande;

    // Constructor
    public Mashin() {
        out.println("Yek mashin.Mashin Bedon Dade Sakhte Shod");
    }

    public Mashin(String mark) {
        this.mark = mark;
        out.println("Yek mashine " + this.mark + " sakhte shod");
    }

    //Tabe(method) :
    public void roshan() {
        out.println("mashin.Mashin roshan ast");
        ayaMashinRoshanAst = true;
    }

    void khamosh() {
        out.println("mashin.Mashin khamosh ast");
        ayaMashinRoshanAst = false;
    }

    void bazKardanDar() {
        out.println("Dar baz ast");
        ayaDarMashinBazAst = true;
    }

    void basatanDar() {
        out.println("Dar baste shod");
        ayaDarMashinBazAst = false;
    }

    public boolean ayaMashinDarHaleHarekatAst() {
        // dar baste bashad va mashin roshan bashad (rule)
        if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
            out.println("mashin.Mashin Dar Hal Harekat Ast");
            return true;
        } else {
            out.println("mashin.Mashin Park Ast");
            return false;
        }
    }
}
