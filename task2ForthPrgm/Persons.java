package task2ForthPrgm;

class Persons {
         String name;
         int age;
         public Persons(String name, int age) {
             this.name = name;
             this.age = age;
         }
         public void displayPersonInfo() {
             System.out.println("Name: " + name);
             System.out.println("Age: " + age);
         }
}
