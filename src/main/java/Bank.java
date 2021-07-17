public class Bank {

    String bankName;
    String branchLocation;
    String atmLocation;
    double ckgBalance;
    int routingNo;

    public Bank() {

    }

    public Bank(String bankName, String branchLocation) {
        this.bankName = bankName;
        this.branchLocation = branchLocation;
        this.atmLocation = branchLocation;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

    public String getAtmLocation() {
        return atmLocation;
    }

    public void setAtmLocation(String atmLocation) {
        this.atmLocation = atmLocation;
    }

    public int getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(int routingNo) {
        this.routingNo = routingNo;
    }
}
