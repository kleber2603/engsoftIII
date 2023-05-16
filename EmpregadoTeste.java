package observer.praticate.engIII;

public class EmpregadoTeste 
{ 
 public static void main(String[] args) 
 { 
  Emprego e = new Emprego();
  TelaDados dados = new TelaDados();
  TelaAtualizar atualizar = new TelaAtualizar();
  
  e.registerObserver(dados);
  e.registerObserver(atualizar);
    
  Empregado empregado = new Empregado("Paulo","Sergio",800.0);
  e.calcular(empregado,200.0);
 }
}