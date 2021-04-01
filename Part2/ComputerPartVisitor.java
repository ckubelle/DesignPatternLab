package Part2;

public interface ComputerPartVisitor {
public void visit(Computer computer); 
public void visit(Mouse mouse); 
 void visit(Keyboard keyboard);
  public void visit(Monitor monitor);
}
