package com.rastakiki.scalatest

trait ExpenseRepository {

  def findAll: Seq[Expense]

  def save(expense: Expense): Unit

}
