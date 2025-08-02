import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MashinTest {

    @Test
    void Mashin_Bayad_Harekat_Konad_Vaghty_Dar_Baste_Ast_Va_Mashin_Roshan_Ast() {
        // Given
        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        // When
        boolean ayaHarekatMikonad = benz.ayaMashinDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaMashinDarHaleHarekatAst();

        // Then
        assertFalse(ayaHarekatMikonad);
        assertTrue(ayaVolvoHarekatMikonad);

        // Object Mashin
//        Mashin mashin = new Mashin();
//        mashin.bazKardanDar();
//        mashin.basatanDar();
//
//        out.println("Dar Mashin Baz Ast ? " + mashin.ayaDarMashinBazAst);
//
//        mashin.harekat();
//
//        out.println("------------------------------------------");
//
//        Mashin pride = new Mashin("Pride");
//        pride.roshan();
//        pride.bazKardanDar();
//
//        pride.harekat();
    }

    class Mashin {

        //Dade :
        boolean ayaMashinRoshanAst; // false
        boolean ayaDarMashinBazAst; // false
        String mark;

        // Constructor
        Mashin() {
            out.println("Yek Mashin Bedon Dade Sakhte Shod");
        }

        Mashin(String mark) {
            this.mark = mark;
            out.println("Yek mashine " + this.mark + " sakhte shod");
        }

        //Tabe(method) :
        void roshan() {
            out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }

        void khamosh() {
            out.println("Mashin khamosh ast");
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

        boolean ayaMashinDarHaleHarekatAst() {
            // dar baste bashad va mashin roshan bashad (rule)
            if (!ayaDarMashinBazAst && ayaMashinRoshanAst) {
                out.println("Mashin Dar Hal Harekat Ast");
                return true;
            } else {
                out.println("Mashin Park Ast");
                return false;
            }
        }

    }

}
