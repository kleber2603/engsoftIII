package dev.jornada.design.composite;

public class Quadrado implements Forma 
{
 public void desenho(String fillColor) 
 {
  System.out.println("Desenhando o quadrado com a cor "+fillColor);
 }
}