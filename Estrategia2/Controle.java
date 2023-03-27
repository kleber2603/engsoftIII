package Strategy2.example;

import java.util.Scanner;

public class Controle 
{
 public Scanner scanner;	
 public Controle() 
 {
  scanner = new Scanner(System.in);	  
 }	 
 public String texto()
 {
  String t = scanner.nextLine();
  return t;
 }	 
}