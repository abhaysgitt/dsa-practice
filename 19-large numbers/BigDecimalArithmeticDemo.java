import java.math.BigInteger;
import java.math.BigDecimal;

class BigDecimalArithmeticDemo {
  public static void main(String[] args) {
    BD();
  }

  static void BD() {
    double x = 0.03;
    double y= 0.04;
    
    

    BigDecimal X = new BigDecimal("0.03");
    BigDecimal Y = new BigDecimal("0.04");
    BigDecimal ans = Y.subtract(X);
    

    BigDecimal a = new BigDecimal("456576345675.4546376");
    BigDecimal b = new BigDecimal("547634565352.986785764");

    
    System.out.println(b.add(a));
    System.out.println(b.subtract(a));
    System.out.println(b.multiply(a));
    System.out.println(b.pow(2));
    System.out.println(b.negate());

    
    BigDecimal con = BigDecimal.ONE;

  }

  
  static void BI() {
    int a = 30;
    int b = 67;

    BigInteger B = BigInteger.valueOf(6); 
    int c = B.intValue(); 
    BigInteger C = new BigInteger("2345678654325678976543256789");
    BigInteger X = new BigInteger("4536789765432");

    
    BigInteger D = BigInteger.TEN;

    
    BigInteger s = C.add(X);

    BigInteger m = C.multiply(X);

    BigInteger sub = C.subtract(X);

    BigInteger d = C.divide(X);

    BigInteger rem = C.remainder(X);

    if (X.compareTo(C) < 0) {
          System.out.println("Yes");
    } 

    System.out.println(Factorial.fact(100));
  }
  
}