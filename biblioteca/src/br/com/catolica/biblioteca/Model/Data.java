package br.com.catolica.biblioteca.Model;

public class Data {
    int dia;
    int mes;
    int ano;
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString(){
        return String.format("<Data: %d/%d/%d>", this.dia, this.mes, this.ano);
    }
}
