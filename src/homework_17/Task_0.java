package homework_17;/* Group: 52-1, "AIT Hi-tech team" GMBH 
Author: Bogdan Fesenko
Date: 07-10-2024
*/

import java.math.BigDecimal;

/*

 */
public class Task_0 {
 public String name;
 private BigDecimal age;
 private double salary;

 public Task_0(String name, BigDecimal age, double salary) {
  this.name = name;
  this.age = age;
  this.salary = salary;

 }

 public String toString() {
  return String.format("Employee %s, age: %d, salary: %2f", name, age, salary);
 }
 public void info() {
  System.out.println(this.toString());

 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public BigDecimal getAge() {
  return age;
 }

 public void setAge(BigDecimal age) {
  this.age = age;
 }

 public double getSalary() {
  return salary;
 }

 public void setSalary(double salary) {
  this.salary = salary;
 }
}

