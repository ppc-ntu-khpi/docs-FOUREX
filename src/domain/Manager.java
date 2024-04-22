package domain;

/**
 * Клас менеджера, який розширює клас співробітника і відповідає за керування групою співробітників.
 */
public class Manager extends Employee {

    /**
     * Конструктор класу менеджера.
     *
     * @param employees Масив співробітників, якими керує менеджер.
     * @param name Ім'я менеджера.
     * @param jobTitle Назва посади менеджера.
     * @param level Рівень менеджера.
     * @param dept Департамент, в якому працює менеджер.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає рядок, що представляє клас менеджера разом зі списком підлеглих співробітників.
     *
     * @return Рядок із відомостями про менеджера та його підлеглих співробітників.
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Конструктор класу менеджера з масивом співробітників.
     *
     * @param employees Масив співробітників, якими керує менеджер.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Базовий конструктор класу менеджера, який ініціалізує порожній масив співробітників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає рядок з іменами підлеглих співробітників.
     *
     * @return Рядок із іменами підлеглих співробітників.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює масив співробітників, якими керує менеджер.
     *
     * @param employees Масив співробітників, якими керує менеджер.
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає масив підлеглих співробітників менеджера.
     *
     * @return Масив підлеглих співробітників менеджера.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
