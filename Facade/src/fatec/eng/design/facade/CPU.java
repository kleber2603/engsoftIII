package fatec.eng.design.facade;

public class CPU 
{
 public void iniciar() 
 {
  System.out.println("inicializacao inicial");
 }
 public void executar() 
 {
  System.out.println("executa algo no processador");
 }
 public void carregar() 
 {
  System.out.println("carrega registrador");
 }
 public void liberar() 
 {
  System.out.println("libera registradores");
 }
}