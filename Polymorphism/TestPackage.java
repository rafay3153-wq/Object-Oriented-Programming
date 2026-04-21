class Package {
    private String senderName, senderAddress, reciverName, reciverAddress;
    private double weight, costPerOunce;
    public Package(String senderName, String senderAddress, String reciverName, String reciverAddress, double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.reciverName = reciverName;
        this.reciverAddress = reciverAddress;
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else {
            this.costPerOunce = 0;
        }
    }
    public double calculateCost() {
        return weight * costPerOunce;
    }
    class TwoDayPackage extends Package {
        private double flatFee;
        public TwoDayPackage(String senderName, String senderAddress, String reciverName, String reciverAddress, double weight, double costPerOunce, double flatFee) {
            super(senderName, senderAddress, reciverName, reciverAddress, weight, costPerOunce);
            this.flatFee = flatFee;
        }
        @Override
        public double calculateCost() {
            return super.calculateCost() + flatFee;
        }
    }
    class OvernightPackage extends Package {
        private double extraFeePerOunce;
        public OvernightPackage(String senderName, String senderAddress, String reciverName, String reciverAddress, double weight, double costPerOunce, double additionalFeePerOunce) {
            super(senderName, senderAddress, reciverName, reciverAddress, weight, costPerOunce);
            this.extraFeePerOunce = extraFeePerOunce;
        }
        @Override
        public double calculateCost() {
            return (weight*(costPerOunce + extraFeePerOunce));
        }
    }
}
public class TestPackage {
    public static void main(String[] args) {
        Package p1 = new Package("Ali", "Islamabad", "Ahmed", "Lahore", 10, 5);
        Package p2 = p1.new TwoDayPackage("Ajmal", "Karachi", "Zain", "Multan", 8, 4, 20);
        Package p3 = p1.new OvernightPackage("Usman", "Peshawar", "Hassan", "Quetta", 6, 3, 2);
        Package[] packages = new Package[3];
        packages[0] = p1;
        packages[1] = p2;
        packages[2] = p3;
        for (int i=0;i< packages.length;i++) {
            System.out.println("Cost: " + packages[i].calculateCost());
        }
    }
}