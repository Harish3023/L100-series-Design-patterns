package behavioral.chainofresponsibility;

public class ApprovalDemo {
    public static void main(String[] args) {
        Approver manager = new ManagerApprover();
        Approver director = new DirectorApprover();
        Approver ceo = new CEOApprover();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        manager.approveRequest(5000);
        manager.approveRequest(20000);
        manager.approveRequest(100000);
    }
}
