package Strategy.example;

public class Teste 
{
 public static void main(String[] args) 
 {
  Esporte esporte = new Esporte();
  esporte.notNadar(new Atleta());
  esporte.realizarNado();
  esporte.notNadar(new NaoNado());
  esporte.realizarNado(); 
 }
}