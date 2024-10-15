public class Main {
    public static void main(String[] args) {

        int f0 = 1;
        int f1 = 1;
       int sum = f0 + f1;
        for (int i =2; ; i++) {

            int next = f0 + f1;
            if (next > 1000) {
                break;

            }
            sum +=next;
            f0 = f1;
            f1 = next;

            System.out.println(sum);
        }
    }
}