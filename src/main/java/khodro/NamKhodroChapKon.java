package khodro;

public class NamKhodroChapKon { // Open Close Principle // Dependency Injection

    Khodro[] khodroha;

    // Constructor
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;
    }
    public String execute() {
        String nameKhodroha = "";

        for (int neshanegar = 0; neshanegar < khodroha.length; neshanegar++) {
            Khodro khodro = khodroha[0];
            if (neshanegar != khodroha.length -1) {
                nameKhodroha = nameKhodroha + khodro.getMark() + "-";
            } else {
                nameKhodroha = nameKhodroha + khodro.getMark();
            }
        }

        return nameKhodroha;
    }
}
