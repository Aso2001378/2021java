package saisyuu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("title");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("入力してください");
        String name = scanner.next();
        System.out.println("名前は"+name+"です。");
        
    }
}
