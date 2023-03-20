import java.util.ArrayList;
import java.util.Scanner;

public class flowers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<Integer>();
        for (int i = 0; i <5 ; i++) {
            List.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            if(List.get(i)%2==1) System.out.println(i);

        }
    }
}