package com.rastakiki.scalatest

import java.time.LocalDate

import org.junit._
import org.junit.Assert._

class PresentExpensesUseCaseTest {

  @Test
  def given_expenses_should_return_corresponding_PresentableExpenses(): Unit = {
    val useCase = new PresentExpensesUseCase(new InMemoryExpenseRepository)
    val expenseDate = LocalDate.now

    useCase.saveExpense(Expense(10.0d, expenseDate))
    useCase.saveExpense(Expense(20.0d, expenseDate))

    val expenses = useCase.getAllExpense()
    assertEquals(expenses.length, 2)
    assertTrue(expenses.contains(Expense(10.0d, expenseDate)))
    assertTrue(expenses.contains(Expense(20.0d, expenseDate)))
  }

}