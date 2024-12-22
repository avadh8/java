interface Payment{

    void processPayment(double Amount);
}

interface paymentDecline{

    void processPaymentDecline();
}

class cardPayment implements Payment{

    public void processPayment(double Amount){
        System.out.println("card payment");
    }
}

class UPIpayment implements Payment, paymentDecline{

    @Override
    public void processPayment(double Amount){
        System.out.println("UPI payment");
    }

    public void processPaymentDecline(){
        System.out.println("payment is declining...");
    }
}

public class AbstractionInterfaceEx {

    public static void main(String[] args) {

        cardPayment cp = new cardPayment();
        cp.processPayment(1000);

        UPIpayment upi = new UPIpayment();
        upi.processPayment(999999);

    }
}
