using System.IO; 
using System;  
class Program {     
    public static double GetAmount(){         
        //Prompt the user to enter amount         
        Console.WriteLine("Enter the amount :");         
        double val=Convert.ToDouble(Console.ReadLine());         
        //Validate if the user entered a non-negative number         
        if(val<0){             
            Console.WriteLine("The amount must be non-negative");             
            val=GetAmount();         
            }         
            return val;     
    }     
    
    public static void Withdrawal(double amount,ref double balance)     {         
        //If the amount is greater than balance         
        //Print "You cannot withdraw an amount greater than your balance"         
        //else deduct the amount and 1.50 service charge from balance         
        if(amount>balance) {             
            Console.WriteLine("You cannot withdraw an amount greater than your balance");         
        }
        else{             
            balance=balance-amount-1.50;         
        }         
    }     
    
    public static void Deposit(double amount,ref double balance) {         
        //If the amount is greater than 2000, add a 1% bonus         
        if(amount>=2000){             
            double bonus=0.01*amount;             
            balance=balance+amount+bonus;         
        }         
        else{             
            balance=balance+amount;         
        }     
    }     
    
    public static void Print(double balance) {         
        //Print the balance         
        Console.WriteLine("The balance is "+balance);     
    }     
    
    static void Main() {         
        //Initialize balance to 0         
        double balance=0;         
        do{             
            //Prompt the user to enter a transaction(char)             
            Console.WriteLine("Enter a transaction :");             
            char c=Char.ToLower(Console.ReadLine()[0]);             
            double amount;             
            switch (c) {                 
                //if the user wants to Withdraw                 
                case 'w':                     
                    amount=GetAmount();                     
                    Withdrawal(amount, ref balance);                     
                    break;                 
                    
                //if the user wants to Deposit                 
                case 'd':                     
                    amount=GetAmount();                     
                    Deposit(amount, ref balance);                     
                    break;                 
                    
                //if the user wants to Print the balance                 
                case 'p':                     
                    Print(balance);                     
                    break;                 
                    
                //If the user wants to quit                 
                case 'q':                     
                    System.Environment.Exit(0);                     
                    break;   

                default:                     C
                    onsole.WriteLine("Enter a valid transaction");                     
                    break;             
            }         }
            
            while(true);              
            } 
        }
 

