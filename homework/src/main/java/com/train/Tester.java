package com.train;

public class Tester
{
    int tickets;
    int rtt;


    public Tester(int tickets, int rtt)
    {

        this.tickets = tickets;
        this.rtt = rtt;
     }
     public void perint()
     {
       double result = (((rtt*2000)*0.9)+((tickets-rtt)*1000)) ;
         System.out.println("總共票數: "+tickets +"\n"+"來回票"+ rtt+"\n"+"總共金額"+result);
     }


}