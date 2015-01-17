package com.rastakiki.scalatest

import org.scalatest.{FunSpec, Matchers}

class PresentEmployeeUseCaseTest extends FunSpec with Matchers {

  def fixture = new {
    val useCase = new PresentEmployeeUseCase(new InMemoryEmployeeRepository)
    useCase.saveEmployee(Employee("Eric", new Salary(30000d)))
    useCase.saveEmployee(Employee("Didier", new Salary(30000d)))
  }

  describe("PresentEmployeeUseCase") {

    it("can return Employees") {
      val useCase = fixture.useCase

      val expenses = useCase.getAllEmployee()

      expenses should have size (2)
      expenses should (contain(Employee("Eric", new Salary(30000d))) and contain(Employee("Didier", new Salary(30000d))))
    }

    it("can compute total wages per year") {
      val useCase = fixture.useCase

      val totalSalaries = useCase.getTotalSalaries()

      totalSalaries should be(60000d +- .01d)
    }

  }

}
