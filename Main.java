class Main {
  public static void main(String[] args) {

      Pessoa p1 = new Pessoa();
      p1.nome = "Jose";
      p1.idade = 50;
      p1.sexo = "Msculino";
      p1.altura = 1.70f;
      p1.peso = 70f;
      
      p1.calcularIMC(p1.peso,p1.altura);
      p1.impremeIMC();

      Pessoa p2 = new Pessoa();
      p2.nome = "Maria";
      p2.idade = 30;
      p2.sexo = "Maculino";
      p2.altura = 1.50f;
      p2.peso = 70f;
      
      p2.calcularIMC(p2.peso,p2.altura);
      p2.impremeIMC();
  }
}
