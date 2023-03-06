package Strategy.example;

public class Esporte 
{ 
 private Nadador nadador;
 public void notNadar(Nadador pnadador)
 {
  nadador = pnadador;	 
 }
 public void realizarNado()
 {
  nadador.nadar();	 
 }
}