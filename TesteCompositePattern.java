package dev.jornada.design.composite;

public class TesteCompositePattern 
{
 public static void main(String[] args) 
 {
  Forma tri = new Triangulo();  
  Forma cir = new Circulo();
  Forma qua = new Quadrado();
  Desenho desenho = new Desenho();
  
  desenho.add(tri);
  desenho.add(cir);
  desenho.add(qua);
  desenho.desenho("Vermelho");
  
  desenho.clear();
  
  desenho.add(tri);
  desenho.add(cir);
  desenho.add(qua);
  desenho.desenho("Verde");  
  
  desenho.clear();
  
  desenho.add(tri);
  desenho.add(cir);
  desenho.add(qua);
  desenho.desenho("Preto");  
 }
}