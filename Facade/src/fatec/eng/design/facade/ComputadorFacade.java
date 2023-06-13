package fatec.eng.design.facade;

public class ComputadorFacade 
{
 private CPU cpu;
 private Memoria memoria;
 private HardDrive hardDrive;

 public ComputadorFacade() 
 {
  this.cpu = new CPU();
  this.memoria = new Memoria();
  this.hardDrive = new HardDrive();
 }
 public void ligarComputador() 
 {
  cpu.iniciar();  
  memoria.carregar();
  cpu.executar();
  memoria.liberar();
  hardDrive.ler();
  hardDrive.escrever();
 }
}