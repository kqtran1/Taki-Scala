package com.rastakiki.scalatest

trait ExpenseRepository {

  def findAll: Seq[Employee]

  def save(expense: Employee): Unit

}
