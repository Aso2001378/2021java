package saisyuu;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        for(int a=1;a<3; a++){
            System.out.println(a+"ターン目");
        }

        System.out.println("船1生きている");
        System.out.println("船2生きている");
        System.out.println("船3生きている");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("爆弾のx座標を入力してください(1-5)");
        String x = scanner1.next();
        System.out.println(x);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("爆弾のy座標を入力してください(1-5)");
        String y = scanner2.next();
        System.out.println(y);

        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println(num);


        int [][] arr=new int[3][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=10;
        arr[1][1]=20;
        arr[2][0]=100;
        arr[2][1]=200;


        }
    }
