class Bank {

    long[] bal;
    int n;

    public Bank(long[] balance) {
        bal = balance;
        n = balance.length;
    }

    private boolean valid(int acc) {
        return acc >= 1 && acc <= n;
    }

    public boolean transfer(int a1, int a2, long money) {
        if (!valid(a1) || !valid(a2)) return false;
        if (bal[a1 - 1] < money) return false;

        bal[a1 - 1] -= money;
        bal[a2 - 1] += money;
        return true;
    }

    public boolean deposit(int acc, long money) {
        if (!valid(acc)) return false;
        bal[acc - 1] += money;
        return true;
    }

    public boolean withdraw(int acc, long money) {
        if (!valid(acc)) return false;
        if (bal[acc - 1] < money) return false;

        bal[acc - 1] -= money;
        return true;
    }
}

class Banking {
    public static void main(String[] args) {
        long[] arr = {1000, 2000, 3000};
        Bank b = new Bank(arr);
        System.out.println(b.transfer(1, 2, 500));
        System.out.println(b.withdraw(3, 1000));
        System.out.println(b.deposit(1, 200));
    }
}
