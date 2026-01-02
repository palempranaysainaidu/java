import java.util.StringTokenizer;
import java.util.Scanner;

class StringTokenizerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(line);

        int sum = 0;

        while (tokenizer.hasMoreTokens()) {
            int num = Integer.parseInt(tokenizer.nextToken());
            System.out.println(num);
            sum += num;
        }

        System.out.println(sum);
    }
}
