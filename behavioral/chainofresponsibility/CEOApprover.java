package behavioral.chainofresponsibility;

class CEOApprover extends Approver {
    @Override
    public void approveRequest(int amount) {
        if (amount > 50000) {
            System.out.println("CEO approved the request of Rs" + amount);
        } else {
            System.out.println("Amount did not meet any approval rule.");
        }
    }
}
