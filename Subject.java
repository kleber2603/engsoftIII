package observer.praticate.engIII;

public interface Subject 
{
 public void registerObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObservers(String nome, String sobrenome, double salario, double novosalario);
}