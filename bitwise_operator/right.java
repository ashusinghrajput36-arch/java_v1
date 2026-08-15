package bitwise_operator;

class rightshift {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= 10; i++) {
            n = n >> 1;
            System.out.println(n);
        }
    }}
