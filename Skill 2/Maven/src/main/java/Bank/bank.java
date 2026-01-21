package Bank;


class bank {
 double getInterestRate() {
     return 0.0;
 }
}
class SBI extends bank {
 @Override
 double getInterestRate() {
     return 6.5;
 }
}

class HDFC extends bank {
 @Override
 double getInterestRate() {
     return 7.0;
 }


 public static void main(String[] args) {
     bank b1 = new SBI();
     bank b2 = new HDFC();

     System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
     System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
 }}