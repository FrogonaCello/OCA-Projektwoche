package aprojektwoche.model;

import java.time.LocalDate;

public class Composer {
	
	  // Attribute
	  private String name;
	  private LocalDate startOfLife;
	  private boolean alive;
	  private LocalDate lifeCycle;
	  
	  
	  // Getter/Setter
	  
	  public String getName() {
		  return this.name; 
	  }
	  
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public LocalDate getStartOfLife() {
		  return this.startOfLife;
	  }
	  
	  public void setStartOfLife(LocalDate startOfLife) {
		  this.startOfLife = startOfLife;
	  }
	  
	  public boolean isAlive() {
		  return this.alive;
	  }
	  
	  public void setAlive(boolean alive) {
		  this.alive = alive;
	  }
	  
	  public LocalDate getLifeCycle() {
		  return this.lifeCycle;
	  }
	  
	  public void setLifeCycle(LocalDate localdate) {
		  this.lifeCycle = localdate;
	  }
	  
	  // Konstruktoren
	  
	  public Composer() {
		  
	  }
	  
	  public Composer(String name, LocalDate start, boolean alive, LocalDate end) throws NullPointerException{
		  this.setName(name);
		  this.setStartOfLife(start);
		  this.setAlive(alive);
		  if (alive == false && end != null) {
			  this.setLifeCycle(end);
		  }
		  
		  }
	  
	  // toString()
	  
	  public String toString() {
		  // in any case the output will include the birth date
		  String output = this.getName() + ", born: " + this.getStartOfLife().format(FormatDateTime.date_tf);
		  
		  // if composer is not alive anymore, then life cycle will be part of the output
		  if (this.isAlive() == false && this.getLifeCycle() != null) {
			  output = this.getName() + ", " + this.getStartOfLife().format(FormatDateTime.date_tf) + " until " + this.getLifeCycle().format(FormatDateTime.date_tf);
		  }
		  return output;
	  }
	  
	  
  
  
  
  
  
  
}
