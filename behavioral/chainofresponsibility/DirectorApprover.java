package behavioral.chainofresponsibility;

class DirectorApprover extends Approver {
    @Override
    public void approveRequest(int amount) {
        if (amount <= 50000) {
            System.out.println("Director approved the request of Rs" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
