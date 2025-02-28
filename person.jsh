Person person1 = new Person("Christian", 34);
Person person2 = new Person("Jaimie", 32);
person1.name
person2.age
person1.sayHello()
person2.haveBirthday()
person2.isAdult()
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

      boolean isAdult() {
        return age >= 18;
    }

    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
}
person2.isAdult()