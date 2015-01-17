package com.rastakiki.scalatest

import java.time.LocalDate

import org.scalatest.{FunSpec, Matchers}

class PresentExpensesUseCaseScalaTest extends FunSpec with Matchers {

  describe("PresentExpenseUseCase") {
    it("can return Expenses") {
      val useCase = new PresentExpensesUseCase(new InMemoryExpenseRepository)
      val expenseDate = LocalDate.now

      useCase.saveExpense(Expense(10.0d, expenseDate))
      useCase.saveExpense(Expense(20.0d, expenseDate))

      val expenses = useCase.getAllExpense()

      expenses should have size(2)
    }
  }

}
