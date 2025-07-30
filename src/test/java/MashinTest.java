import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin {

        //Dade :
        boolean ayaMashinRoshanAst;
        boolean ayaDarMashinBazAst;
        double toul;
        double arz;
        String mark;

        //Tabe(method) :
        void roshan() {
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamosh() {
            System.out.println("Mashin khamosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardanDar() {
            System.out.println("Dar baz ast");
            ayaDarMashinBazAst = true;
        }

        void basatanDar() {
            System.out.println("Dar baste shod");
            ayaDarMashinBazAst = false;
        }

        void harekat() {
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
                System.out.println("Mashin Dar Hal Harekat Ast");
            }else{
                System.out.println("Mashin Park Ast");
            }
        }

    }

}
