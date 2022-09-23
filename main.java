import java.util.Scanner;
public class main{
    public static void main(String[] args){
        String [] board =
        {"  ", "A     ", "B     ", "C     ", "D     ", "E     ", "F     ", "G     ", "H     ",
        "\n1 ", "R(B1) ", "N(B1) ", "B(B1) ", "Q(B)  ", "K(B)  ", "B(B2) ", "N(B2) ", "R(B2) ",
        "\n2 ", "P(B1) ", "P(B2) ", "P(B3) ", "P(B4) ", "P(B5) ", "P(B6) ", "P(B7) ", "P(B8) ",
        "\n3 ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "\n4 ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "\n5 ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "\n6 ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "\n7 ", "P(W1) ", "P(W2) ", "P(W3) ", "P(W4) ", "P(W5) ", "P(W6) ", "P(W7) ", "P(W8) ",
        "\n8 ", "R(W1) ", "N(W1) ", "B(W1) ", "Q(W)  ", "K(W)  ", "B(W2) ", "N(W2) ", "R(W3) "};
        Scanner scanner = new Scanner(System.in);
        for (int x = 0; x < 81; x++){
            System.out.print(board[x]);
        }
    }
}