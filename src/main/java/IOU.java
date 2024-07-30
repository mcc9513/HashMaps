import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    public IOU() {
        this.debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        IOU myIOU = new IOU();
        myIOU.setSum("Alice", 50.5);
        myIOU.setSum("Bob", 20.0);
        System.out.println("Amount owed to Alice: " + myIOU.howMuchDoIOweTo("Alice"));
        System.out.println("Amount owed to Bob: " + myIOU.howMuchDoIOweTo("Bob"));
        System.out.println("Amount owed to Charlie: " + myIOU.howMuchDoIOweTo("Charlie"));
    }
}
