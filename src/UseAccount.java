public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.name = " Барри ";
        myAccount.address = " 222 Inner Lane ";
                myAccount.balance = 24.02;
        yourAccount.name = " Джейн ";
                yourAccount.address = " 121 Outer Street ";
                        yourAccount.balance = 55.63;
                        myAccount.display();
                        System.out.println();
        yourAccount.display();
    }
}
