import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;

class StringBufferDemo {
  public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());

    
    StringBuffer sb2 = new StringBuffer("Abhay Kushwaha");

    
    StringBuffer sb3 = new StringBuffer(30);
    System.out.println(sb3.capacity());


    sb.append("WeMakeDevs");
    sb.append(" is nice!");

    

    sb.replace(1, 5, "Kushwaha");

    sb.delete(1, 5);

    

    String str = sb.toString();
    System.out.println(str);

    int n = 20;
    String name = RandomString.generate(n);
    System.out.println(name);

    

    String sentence = "Hi h   hjh  hjkso  siowi     w ";
    System.out.println(sentence);

    System.out.println(sentence.replaceAll("\\s", ""));

    

    String arr = "Abhay,Apoorv,Rahul,Snehal";
    String[] names = arr.split(",");
    System.out.println(Arrays.toString(names));

    
    DecimalFormat df = new DecimalFormat("00.0000");
    System.out.println(df.format(7.29));
  }
}