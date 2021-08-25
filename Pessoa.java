public class Pessoa{
  
    public String nome;
    public int idade;
    protected String sexo;
    public float altura;
    public float peso;
    private float imc;

    public void calcularIMC (float peso, float altura){
      this.imc = peso/(altura*altura);
    }

    public void impremeIMC(){
      System.out.printf("O IMC do(a) %s e' %.2f\n\n", this.nome, this.imc);
    }
}