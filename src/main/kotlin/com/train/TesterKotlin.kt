package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var totalTickets = 0
    while (totalTickets != -1 ) {
        print("Please enter number of tickets: ")
        totalTickets = scanner.nextInt()
        if(totalTickets != -1){
            print("How many round-trip tickets: ")
            var rtTickets = scanner.nextInt()
            val ticket = TicketKotlin(totalTickets, rtTickets)
            ticket.print()
        }
    }

}

class TicketKotlin(var totalTickets: Int , var rtTickets: Int){
    fun print(){
        println("Total tickets: $totalTickets\n"+
                "Round-trip: $rtTickets\n"+
                "Total:"+((totalTickets-rtTickets)*1000+(rtTickets*2000*0.9)).toInt())
    }
}