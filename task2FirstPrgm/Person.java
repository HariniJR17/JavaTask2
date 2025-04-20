package task2FirstPrgm;

public class Person {
        String name;
        int age;
        
    // Constructor 1: name only for default age 18
        public Person(String name) {
        	this.name = name;
        	this.age = 18;
        }
     // Constructor 2: get both name and age
        public Person(String name, int age) {
        	this.name = name;
        	this.age = age;
        }
      // to display name and age
        public void displayDetails() {
        	System.out.println("Name: " +name);
        	System.out.println("Age: " +age);
        
        }
}
