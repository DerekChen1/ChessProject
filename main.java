import java.util.Scanner;
public class main{
    public static void main(String[] args){
        String [] board =
        {"R(B1) ", "N(B1) ", "B(B1) ", "Q(B)  ", "K(B)  ", "B(B2) ", "N(B2) ", "R(B2) ",
        "P(B1) ", "P(B2) ", "P(B3) ", "P(B4) ", "P(B5) ", "P(B6) ", "P(B7) ", "P(B8) ",
        "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ", "_     ",
        "P(W1) ", "P(W2) ", "P(W3) ", "P(W4) ", "P(W5) ", "P(W6) ", "P(W7) ", "P(W8) ",
        "R(W1) ", "N(W1) ", "B(W1) ", "Q(W)  ", "K(W)  ", "B(W2) ", "N(W2) ", "R(W3) "};
        String [] boardCollumns = {"  ", "A     ", "B     ", "C     ", "D     ", "E     ", "F     ", "G     ", "H     "};
        String [] boardRows = {"\n1 ", "\n2 ", "\n3 ", "\n4 ", "\n5 ", "\n6 ", "\n7 ", "\n8 "};
        for (int x = 0; x < 9; x ++){
            System.out.print(boardCollumns[x]);
        }
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        for (int x = 0; x < 64; x++){
            if (x%8 == 0){
                System.out.print(boardRows[x/8]);
            }
            System.out.print(board[x]);
        }

    }
}