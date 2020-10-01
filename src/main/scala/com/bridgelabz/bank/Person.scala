package com.bridgelabz.bank

class Person(name:String,choice:Int) {
  private val NameOfPerson = name
  private val ChoiceTaken = choice
  private var totalAmount:Double = 0
  // method which deposit money
  private def deposit(amount:Double) {
    totalAmount += amount
    println("Your Total Amount is " + totalAmount)
  }
  // method to withdraw money
  private def withdraw(amount:Double): Unit = {
    if(totalAmount - amount < 0) {
      println(s"$NameOfPerson Sorry!! Amount left is $totalAmount ")
      return
    }
    totalAmount -= amount
    println(s"$NameOfPerson Total Amount is "+totalAmount)
  }
  // person preference
  def personChoice(): Unit = {
    ChoiceTaken match {
      case 1 =>
        println("Enter the Amount you want to Deposit")
        val Amount = scala.io.StdIn.readDouble()
        deposit(Amount)
      case 2 =>
        println("Enter the Amount you want to Withdraw")
        val Amount = scala.io.StdIn.readDouble()
        withdraw(Amount)
      case _ => println("Invalid Choice")
    }
  }
  def getName(): String = {
    NameOfPerson
  }

}