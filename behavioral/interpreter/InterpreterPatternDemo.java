
// Client
package behavioral.interpreter;

public class InterpreterPatternDemo {
    public static Expression getAdminExpression() {
        Expression john = new TerminalExpression("John");
        Expression admin = new TerminalExpression("Admin");
        return new AndExpression(john, admin);
    }

    public static Expression getGuestExpression() {
        Expression guest = new TerminalExpression("Guest");
        Expression admin = new TerminalExpression("Admin");
        return new OrExpression(guest, admin);
    }

    public static void main(String[] args) {
        Expression isAdmin = getAdminExpression();
        Expression isGuest = getGuestExpression();

        System.out.println("John is Admin? " + isAdmin.interpret("John Admin"));
        System.out.println("Guest or Admin? " + isGuest.interpret("Guest"));
    }
}
