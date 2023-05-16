package observer.praticate.engIII;

public class Empregado 
{
 public String nome;
 public String sobrenome;
 public double salario;
 public double novosalario;
 
 public Empregado(String n,String sn, Double s)
 {
  nome = n;
  sobrenome = sn;
  salario = s;
 }
 public void setNome(String nome)
 {
  this.nome = nome;	 
 }
 public String getNome()
 {
  return nome;	 
 }
 public void setSobrenome(String sobrenome)
 {
  this.sobrenome = sobrenome;	 
 }
 public String getSobrenome()
 {
  return sobrenome;	 
 }
 public void setSalario(double salario)
 {
  this.salario = salario;	 
 }
 public double getSalario()
 {
  return salario;	 
 }
 public void setNovoSalario(double novosalario)
 {
  this.novosalario = novosalario;	 
 }
 public double getNovoSalario()
 {
  return novosalario;	 
 } 
}