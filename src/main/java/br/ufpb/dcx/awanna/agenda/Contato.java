package br.ufpb.dcx.awanna.agenda;

import java.io.Serializable;
import java.util.Objects;

public class Contato implements Serializable {
    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int diaAniversario, String mesAniversario) {
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = Integer.parseInt(mesAniversario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getDiaAniversario() == contato.getDiaAniversario() && getMesAniversario() == contato.getMesAniversario() && Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDiaAniversario(), getMesAniversario());
    }

    @Override
    public String toString() {
        return "Contato de nome" + nome + "que aniversaria em" + diaAniversario + "/" + mesAniversario;
    }
}
