package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i=0;i<T;i++){
            int totalMoney = scan.nextInt();
            int moneyPerDay = scan.nextInt() * 30;
            if (moneyPerDay <= totalMoney){
                System.out.println("YES");
            }else {
                System.out.println("No");
            }
        }
    }
}
