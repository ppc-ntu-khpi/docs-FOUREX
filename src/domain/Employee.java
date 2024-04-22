package domain;

/**
 * Базовий клас який є реалізацією співробітника компанії
 */
public class Employee {

    /**
     * Повертає рядок який представляє співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Конструктор класу
     *
     * @param name Ім'я співробітника
     * @param jobTitle Посада співробітника
     * @param level Рівень співробітника
     * @param dept Департамент в якому працює співробітник
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Базовий конструктор класу який генеруэ випадковий ID для співробітника
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Змінює посаду співробітника
     *
     * @param job Посада
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень співробітника якщо він в межах від 1 до 3
     * @param level Рівень
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Позавертає рівень співробітника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає департамент співробітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює департамент співробітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Змінює ім'я співробітника якщо воно є коректним
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
