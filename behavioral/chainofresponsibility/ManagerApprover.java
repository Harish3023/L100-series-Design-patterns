package behavioral.chainofresponsibility;

class ManagerApprover extends Approver {
    @Override
    public void approveRequest(int amount) {
        if (amount <= 10000) {
            System.out.println("Manager approved the request of Rs" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
