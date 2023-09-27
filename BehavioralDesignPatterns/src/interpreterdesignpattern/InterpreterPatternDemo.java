package interpreterdesignpattern;

public class InterpreterPatternDemo {
	
	public static void main(String[] args) 
    {
        Expression person1 = new TerminalExpression("Rakesh");
        Expression person2 = new TerminalExpression("Rujuta");
        Expression isSingle = new OrExpression(person1, person2);
          
        Expression naitik = new TerminalExpression("Naitik");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(naitik, committed);    
  
        System.out.println(isSingle.interpreter("Rakesh"));
        System.out.println(isSingle.interpreter("Rujuta"));
        System.out.println(isSingle.interpreter("Namrata"));
          
        System.out.println(isCommitted.interpreter("Committed, Sid"));
        System.out.println(isCommitted.interpreter("Single, Sid"));
  
    }

}
