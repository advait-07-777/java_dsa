public class patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if((i <= j || i >= 10 - j) && j <=5){
                    System.out.print("*"+" ");
                }
                else if ((i <= 10 - j || i >= j) && j>5){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
