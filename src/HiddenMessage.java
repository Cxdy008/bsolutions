import java.util.Scanner;

public class HiddenMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int TC = input.nextInt();

        for(int a0 = 0; a0 < TC; a0++){
            String str = input.nextLine();
            String str2 = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '.' ) {
                    str2 += str.charAt(i);
                }
            }

            System.out.println(str2);
        }
    }
}
