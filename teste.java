class Main {
  public static void main(String[] args){

    // Criando objetos
    Aluno a1 = new Aluno("João", 8.0, 7.5);
    Aluno a2 = new Aluno("Maria", 9.5, 10.0);

    // Acessando atributos
    System.out.println(a1.nome);
    System.out.println(a2.nota1);

    // Chamando métodos
    a1.apresentar();
    a2.apresentar();

    double m = a1.calcularMedia();
    System.out.println("Média: " + m);
  }
}
