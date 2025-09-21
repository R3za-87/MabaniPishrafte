package khodro;

public class Ranande {
    String name;
    boolean ayaToSavarMashinHasti;
    int age;
    int experience;

    public Ranande() {
    }

    public Ranande(String name) {
        this.name = name;
    }

    void savarShodan() {
        ayaToSavarMashinHasti = true;
    }

    void piadeShodan() {
        ayaToSavarMashinHasti = false;
    }

    void ranandeChandSalashAst() {
        this.age = 27;
    }

    void ranandeCheghadrTajrobeDarad() {
        this.experience = 8;
    }



}
