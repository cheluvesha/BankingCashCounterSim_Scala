package com.bridgelabz.bank

class Queue {
  var head:Node = _
  var rear:Node = _

  class Node(name: String, choice: Int) {
    val person = new Person(name:String,choice:Int)
    var next: Node = _
  }
  // adds person to queue
  def enqueue(name: String,choice: Int): Unit = {
    val NewNode = new Node(name,choice)
    if(head == null && rear == null){
      head = NewNode
    }
    else {
      rear.next = NewNode
    }
    rear = NewNode
  }
  // removes person from queue
  def dequeue(): Unit = {
    if(head == null){
    println("Queue is Empty")
    }
    var pointer = head
    while(pointer != null){
      println(pointer.person.getName()+" choice is yours please continue")
      pointer.person.personChoice()
      pointer = pointer.next
      if(pointer == null){
      println("No one left in the Queue")
      }
    }
  }
  // displays the current queue person name
  def display(): Unit ={
    if(head == null){
      println("Queue Empty")
    }
    var pointer = head
    while(pointer != null){
      println(pointer.person.getName())
      pointer = pointer.next
    }
  }
}
