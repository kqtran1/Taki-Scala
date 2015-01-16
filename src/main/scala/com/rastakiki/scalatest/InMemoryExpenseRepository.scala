package com.rastakiki.scalatest

import scala.collection.mutable

class InMemoryExpenseRepository extends ExpenseRepository {

  private val expenses = new mutable.MutableList[Expense]

  override def findAll: Seq[Expense] = {
    expenses.toList
  }

  override def save(expense: Expense): Unit = {
    expenses += expense
  }
}
