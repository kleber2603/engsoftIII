package Strategy2.example;

import java.util.ArrayList;
import java.util.List;

public class Cadastro implements Empresa
{
 public List<Contato> contatos = new ArrayList<Contato>();  
 public void inserirContato() 
 {	  
  System.out.println("Entre com o nome para o contato:");
  Controle ctrl = new Controle();
  Contato c = new Contato(ctrl.texto());  
  System.out.println("Entre com o DDD para contato:");
  c.ddd = ctrl.texto();        
  System.out.println("Entre com o numero para contato:");
  c.numero = ctrl.texto();
  System.out.println("Entre com o dia de nascimento:");
  c.data = ctrl.texto();
  System.out.println("Entre com o mes de nascimento:");
  c.mes = ctrl.texto();
  System.out.println("Entre com o ano de nascimento:");
  c.ano = ctrl.texto();
  System.out.println("Entre com o genero da pessoa:");
  c.genero = ctrl.texto();
  contatos.add(c); 
  System.out.println("\nNovo contato adicionado!");   
 }   
}