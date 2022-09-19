package ku.atm;

public class NegativeAmountExecption extends Exception {
    public NegativeAmountExecption() {}
    public NegativeAmountExecption(String reason) {
        super(reason);
    }
}
