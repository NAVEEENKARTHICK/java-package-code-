package pack;
public class balance {
 String name;
 double bal;
 public balance(String n, double b) 
{
 name = n;
 bal = b;
 }
 public void show() {
 if (bal > 0) {
 System.out.print("-->");
 System.out.println(name + ": $" + bal);
 }
 }
}
 
Filename : accountbalance.java
import pack.balance;
class accountbalance {
 public static void main(String args[]) {
 balance current[] = new balance[3];
 current[0] = new balance("K.J.Fielding", 123.23);
 current[1] = new balance("Will tell", 157.02);
 current[2] = new balance("Tom jackson", 12.33);
 
 for (int i = 0; i < 3; i++) {
 current[i].show();
 }
 }
}
