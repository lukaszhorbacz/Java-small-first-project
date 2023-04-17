/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kontobankowe;
import java.util.Scanner;
/**
 *
 * @author lukaszhorbacz
 */
public class KontoBankowe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        Account konto = new Account();
        
        System.out.println("twoje początkowe saldo: " + konto.getBalance(0));
        System.out.print("podaj kwotę wpłaty: ");
        double depositNaKonto = scanner.nextDouble();
        konto.deposit(depositNaKonto);
        System.out.println(konto.getBalance(0));
        System.out.print("podaj kwotę wypłaty: ");
        double withdrawZKonta = scanner.nextDouble();
        konto.withdraw(withdrawZKonta);
        System.out.println(konto.getBalance(0));
        
                
       
        
        
        
        
    }
    
}
class Account 
{
    private double balance;
    
    Account ()
    {
        this.balance = 0;
    }
    void deposit(double value)
    {
        
        this.balance += value;
    }
    void withdraw (double value)
    {
        if (value <= this.balance)
        this.balance -= value;
        else 
            System.out.println("za malo kasy na koncie!!!");
    } 
    double getBalance (double balance)
    {
        return this.balance;
    }
    
}

