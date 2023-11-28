import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", "Churka", Gender.MALE, 50, 20000, 21, Speciality.DEV_OPS));
        employeeList.add(new Employee("Olena", "Kurka", Gender.FEMALE, 18, 2000, 4, Speciality.QA));
        employeeList.add(new Employee("Don", "Kochatkov", Gender.MALE, 20, 200000, 5, Speciality.PM));
        employeeList.add(new Employee("Anna", "Kocha", Gender.FEMALE, 20, 1000, 4, Speciality.QA));
        EmployeeRepository employeeRepository = new EmployeeRepository(employeeList);
        System.out.println("робітників з найбільшими зарплатнями (топ 3)");
        System.out.println(Arrays.toString(employeeRepository.getNameAndSurnameOfTop3BySalary()));
        System.out.println("перевіра, чи є у штаті працівник чоловічої статі з відділів backand developer abo dev ops");
        System.out.println(employeeRepository.checkIfPresentWithWorkExperienceMoreThanTwenty());
        System.out.println("розрахувати середню зарплатню для посади");
        System.out.println(employeeRepository.getAverageSalaryBySpeciality());
        System.out.println("згрупувати робітників по спеціальності");
        System.out.println(employeeRepository.groupBySpeciality());
        System.out.println("розрахувати загальну зарплатню жінок не старше 30 років на посаді QA з досвідом роботи до 5 років включно");
        System.out.println(employeeRepository.getSalaryByHugeCriteriaList());
        System.out.println("відсортований за зарплатнею у порядку спадання список всіх працівників");
        System.out.println(employeeRepository.getDescendingSalaryWithFullName());
    }
}
