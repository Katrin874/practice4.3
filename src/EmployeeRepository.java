import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    public String[] getNameAndSurnameOfTop3BySalary() {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(3)
                .map((employee) -> employee.getName() + " " + employee.getLastName()).toArray(String[]::new);
    }

    public Map<Speciality, List<Employee>> groupBySpeciality() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getSpeciality));
    }

    public int getSalaryByHugeCriteriaList() {
        return employees.stream().filter((employees) -> employees.getGender() == Gender.FEMALE
                && employees.getAge() <= 30 && employees.getSpeciality() == Speciality.QA
                && employees.getWorkExperience() <= 5).mapToInt(Employee::getSalary).sum();
    }

    public boolean checkIfPresentWithWorkExperienceMoreThanTwenty() {
        return employees.stream().anyMatch((employees) -> employees.getGender() == Gender.MALE
                && employees.getSpeciality() == Speciality.BACKAND_DEVELOPER || employees.getSpeciality() == Speciality.DEV_OPS
                && employees.getWorkExperience() >= 20);
    }

    public String getDescendingSalaryWithFullName() {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .map((employee) -> employee.getName() + " " + employee.getLastName() + " " + employee.getSalary())
                .collect(Collectors.joining(";"));
    }

    public Map<Speciality, Double> getAverageSalaryBySpeciality() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getSpeciality,
                Collectors.averagingInt(Employee::getSalary)));
    }
}
