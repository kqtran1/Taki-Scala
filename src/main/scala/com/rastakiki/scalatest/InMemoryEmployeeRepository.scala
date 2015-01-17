package com.rastakiki.scalatest

import scala.collection.mutable

class InMemoryEmployeeRepository extends ExpenseRepository {

  private val employees = new mutable.MutableList[Employee]

  override def findAll: Seq[Employee] = {
    employees.toList
  }

  override def save(employee: Employee): Unit = {
    employees += employee
  }
}
