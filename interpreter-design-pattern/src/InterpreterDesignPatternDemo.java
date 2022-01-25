/**
 * It is a behavioural design pattern used majorly in SQL parsing and provides a way to evaluate language grammar
 * or expression
 * */

public class InterpreterDesignPatternDemo {

    public static Expression getMaleExpression(){
        Expression robert = new Terminal("Robert");
        Expression john = new Terminal("John");
        return new OrExpression(robert,john);
    }

    public static Expression getMarriedExpression() {
        Expression julia = new Terminal("Julia");
        Expression married = new Terminal("married");
        return new AndExpression(julia,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedExpression();

        System.out.println("John is male ? " + isMale.interpret("John"));
        System.out.println("Julia is married ? " + isMarried.interpret("Julia is married"));
    }
}
