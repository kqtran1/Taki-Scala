package com.rastakiki.scalatest

class PresentEmployeeUseCase(employeeRepository: ExpenseRepository) {

  def getTotalSalaries(): Double = {
    employeeRepository.findAll.foldLeft(0d)((total, employee) => total + employee.salary.amountPerYear)
  }


  private val this.employeeRepository = employeeRepository

  def getAllEmployee(): Seq[Employee] = {
    employeeRepository.findAll
  }

  def saveEmployee(employee: Employee): Unit = {
    employeeRepository.save(employee)
  }

}
