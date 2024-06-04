class AccountHolder{
    String name;
    String phone;
    String pin;
    int balance;
    String address;
    String account;

    void withdraw(){
        System.out.println("withdraw");
    }
    void deposit(){
        System.out.println("deposit");
    }
    void checkBalance(){
        System.out.println("balance");
    }
}
class Test1 {
    public static void main(String[] args) {

        AccountHolder obj1 = new AccountHolder();
        obj1.account = "123456789";
        obj1.address = "4/B";
        System.out.println(obj1.account);
        System.out.println(obj1.account);
        obj1.deposit();
        obj1.checkBalance();

        System.out.println("---------------------------");

        AccountHolder obj2 = new AccountHolder();
        obj2.withdraw();
        obj2.name = "Bhavy";
        System.out.println(obj2.name);
    }
}
