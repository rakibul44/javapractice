
//creating a class then printing the class name//

public class Account{
    public String account_name = "Rakibul";
   
    public void account_name(String name){
        account_name = name;
    }
   
     public void print_name(){
         System.out.println(account_name);
     }
   
     public static void main(String[] args){
         Account n = new Account();
         n.print_name();
   
     }
   }
