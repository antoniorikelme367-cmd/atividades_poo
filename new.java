
import java.util.ArrayList;

abstract class Contribuinte {
    String nome;
    double rendaBruta;

    Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    abstract double calcularImposto();
}

class PessoaFisica extends Contribuinte {

    PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    double calcularImposto() {
        if (rendaBruta <= 1400)
            return 0;
        else if (rendaBruta <= 2100)
            return rendaBruta * 0.10 - 100;
        else if (rendaBruta <= 2800)
            return rendaBruta * 0.15 - 270;
        else if (rendaBruta <= 3600)
            return rendaBruta * 0.25 - 500;
        else
            return rendaBruta * 0.30 - 700;
    }
}

class PessoaJuridica extends Contribuinte {

    PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    double calcularImposto() {
        return rendaBruta * 0.10;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Contribuinte> lista = new ArrayList<>();

        lista.add(new PessoaFisica("João", 1200));
        lista.add(new PessoaFisica("Maria", 2500));
        lista.add(new PessoaFisica("Carlos", 4000));

        lista.add(new PessoaJuridica("Loja A", 10000));
        lista.add(new PessoaJuridica("Loja B", 15000));
        lista.add(new PessoaJuridica("Loja C", 20000));

        for (Contribuinte c : lista) {
            System.out.println("Nome: " + c.nome);
            System.out.println("Renda: " + c.rendaBruta);
            System.out.println("Imposto: " + c.calcularImposto());
            System.out.println();
        }
    }
}