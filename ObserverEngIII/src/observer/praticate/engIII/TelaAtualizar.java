package observer.praticate.engIII;

public class TelaAtualizar implements Observer
{
 public void update(String nome, String sobrenome, double salario, double novosalario)
 {
  display(nome, sobrenome,novosalario);	 
 }
 public void display(String nome, String sobrenome,double novosalario)
 {  
  System.out.println("\n\nTela de Dados Atualizada");
  System.out.println("Nome: "+nome);
  System.out.println("Sobrenome: "+sobrenome);
  System.out.println("Novo Salario com desconto: "+novosalario);
 }	
}