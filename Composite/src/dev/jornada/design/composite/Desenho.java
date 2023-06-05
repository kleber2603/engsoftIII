package dev.jornada.design.composite;
import java.util.ArrayList;
import java.util.List;

public class Desenho implements Forma 
{
 //collection of Shapes
 private List<Forma> formas = new ArrayList<Forma>(); 
 public void desenho(String fillColor) 
 {
  for(Forma sh : formas)
	 {
	  sh.desenho(fillColor);
	 }
 }		
 //adding shape to drawing
 public void add(Forma s)
 {
  this.formas.add(s);
 }		
 //removing shape from drawing
 public void remove(Forma s)
 {
  formas.remove(s);
 }		
 //removing all the shapes
 public void clear()
 {
  System.out.println("Limpando todas as formas do desenho.");
  this.formas.clear();
 }
}