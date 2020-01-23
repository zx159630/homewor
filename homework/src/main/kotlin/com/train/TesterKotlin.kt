package com.train

import java.util.*

fun main(args: Array<String>) {
    var confir : Int = 1
    while (confir !=0) {
        var scanner = Scanner(System.`in`)
        print("請輸入總共票數: ")
        var ticketss = scanner.nextInt()
        print("請輸入來回票數:  ")
        var Rt = scanner.nextInt()
        val ti = Taster(ticketss, Rt)
        ti.print()
        println("是否要停止交易，是的話請填0 繼續的話請填1")
        confir = scanner.nextInt()
        if (confir != 1) {
            println("交易完成")

        } else {
            println("繼續交易")
        }
    }
}


class Taster (var ticketss:    Int , var Rt :Int )   {

   var va : Double = (((Rt * 2000) * 0.9)+ ((ticketss-Rt) * 1000))
    fun print()
    {
        println("總共票數:$ticketss"+"\n"+"來回票:$Rt"+"\n"+"總共金額:$va"+"\n")


    }

}