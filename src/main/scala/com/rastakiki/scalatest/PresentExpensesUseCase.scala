package com.rastakiki.scalatest

class PresentExpensesUseCase(expenseRepository: ExpenseRepository) {

  private val this.expenseRepository = expenseRepository

  def getAllExpense(): Seq[Expense] = {
    expenseRepository.findAll
  }

  def saveExpense(expense: Expense): Unit = {
    expenseRepository.save(expense)
  }

}
