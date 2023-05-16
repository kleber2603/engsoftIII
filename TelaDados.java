package observer.praticate.engIII;

public class TelaDados implements Observer 
{
 public void update(String nome, String sobrenome, double salario, double novosalario)
 {
  display(nome,sobrenome,salario);	 
 }
 public void display(String nome, String sobrenome, double salario) 
 {
  System.out.println("Tela de Dados do Empregado");
  System.out.println("Nome: "+nome);
  System.out.println("Sobrenome: "+sobrenome);
  System.out.println("Salario: "+salario);		
 }
}