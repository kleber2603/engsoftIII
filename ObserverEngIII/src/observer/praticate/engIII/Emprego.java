package observer.praticate.engIII;

import java.util.ArrayList;

public class Emprego implements Subject
{
 private ArrayList<Observer> observers;
 public Emprego() 
 {
  observers = new ArrayList<Observer>();	 
 }	 
 public void registerObserver(Observer o)
 {
  observers.add(o);	  
 }
 public void removeObserver(Observer o)
 {
  int i = observers.indexOf(o);
  if(i>=0)
    {
	 observers.remove(i);
	}
 }
 public void notifyObservers(String nome, String sobrenome, double salario, double novosalario)
 {
  for(int i = 0;i < observers.size();i++)
	  {
	   Observer observer = (Observer)observers.get(i);
	   observer.update(nome, sobrenome, salario, novosalario);	  
	  }      
 }
 public double calcular(Empregado e, double desconto) 
 {
  e.novosalario = e.salario - desconto;
  notifyObservers(e.nome,e.sobrenome,e.salario,e.novosalario);
  return e.novosalario;
 } 
}