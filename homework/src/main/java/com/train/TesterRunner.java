package com.train;

import java.util.Scanner;

public class TesterRunner {
    public static void main(String[] args) {
         int confirm = 1 ;


        while ( confirm != 0)
           {
            System.out.println("請輸入購買票數: ");
            Scanner scanner = new Scanner(System.in);
            int tickets  = scanner.nextInt();
            System.out.println("來回票幾張:  ");
          int  rtt = scanner.nextInt();
            Tester p = new Tester(tickets,rtt);
            p.perint();
            System.out.println("是否要停止交易，是的話請填0 繼續的話請填15");
             confirm = scanner.nextInt() ;
            if (confirm !=1) {
                System.out.println("交易完成");

            }else {
                System.out.println("繼續交易");
            }


        }




    }
}
