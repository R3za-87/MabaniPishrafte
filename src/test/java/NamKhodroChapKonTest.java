import khodro.Khodro;
import khodro.Jadid.Mashin;
import khodro.Motor;
import khodro.NamKhodroChapKon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NamKhodroChapKonTest {

    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        //Given
        Khodro benz = new Mashin("Benz", 120,"Automatic");
        Khodro volvo = new Mashin("Volvo", 120,"Dasti");
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();
        Khodro[] khodroha = {benz, volvo, motor, kashti} ;
        NamKhodroChapKon namKhodroChapKon = new NamKhodroChapKon(khodroha);

        //When
        String ListNamKhodroha = namKhodroChapKon.execute();

        Assertions.assertEquals("Benz-Volvo-Motor-Kashti" ,ListNamKhodroha);
    }
}
