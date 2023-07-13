package Q8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String nome, String capital, double dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensao() {
        return dimensao;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.nome) && this.capital.equals(outro.capital);
    }

    public void definirFronteira(Pais pais) {
        if (!this.equals(pais)) {
            fronteiras.add(pais);
            pais.fronteiras.add(this);
        }
    }

    public List<Pais> getPaisesFronteira() {
        return fronteiras;
    }

    public List<Pais> getVizinhosComuns(Pais outro) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : fronteiras) {
            if (outro.fronteiras.contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }
}


