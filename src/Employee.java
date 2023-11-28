import java.util.Objects;

public class Employee {
    private static int id = 1;
    private String name;
    private String lastName;
    private Gender gender;
    private int age;
    private int salary;
    private int workExperience;
    private Speciality speciality;

    public Employee(String name, String lastName,
                    Gender gender, int age, int salary, int workExperience,
                    Speciality speciality) {

        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.workExperience = workExperience;
        this.speciality = speciality;
    }

    public int getId() {
        return id++;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public Gender getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public int getWorkExperience() {
        return workExperience;
    }
    public Speciality getSpeciality() {
        return speciality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && workExperience == employee.workExperience && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && gender == employee.gender && speciality == employee.speciality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender, age, salary, workExperience, speciality);
    }
    @Override
    public String toString() {
        return "Employee{" + "id= " + getId() +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                ", workExperience=" + workExperience +
                ", speciality=" + speciality +
                '}';
    }
}
