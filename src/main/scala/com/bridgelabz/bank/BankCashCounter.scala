package com.bridgelabz.bank

import scala.annotation.tailrec

object BankCashCounter {
  // method to opt choices wrt deposit and withdraw
  @tailrec
  private def counterQueue(): Unit = {
    var continue = 'Y'
    val customerQueue = new Queue()
    try {
      while (continue.equals('Y')) {
        println("Enter your Name:")
        val Name = scala.io.StdIn.readLine()
        println(s"Welcome $Name Your Options are \n1.Deposit\n2.Withdraw")
        val Choice = scala.io.StdIn.readInt()
        if (Choice == 1 || Choice == 2) {
          customerQueue.enqueue(Name, Choice)
        }
        else {
          throw new Exception("Choice should between 1 or 2. Please Try Again!!!")
        }
        println("If you need to enter more person name Press Y or else type any other letter")
        continue = scala.io.StdIn.readChar()
      }
      println("The Total List of Persons are")
      customerQueue.display()
      customerQueue.dequeue()
    }
    catch {
      case numberException: NumberFormatException => println("Choice should be 1 or 2!!! Try Again")
        counterQueue()
      case otherException: Exception => println(otherException)
        counterQueue()
    }
  }
  // main method
  def main(args: Array[String]): Unit = {
    counterQueue()
  }
}
