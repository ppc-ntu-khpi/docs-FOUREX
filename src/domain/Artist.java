package domain;

/**
 * Клас художника(?) який розширює базовий клас співробітника
 */
public class Artist extends Employee {

    /**
     * Конструктор класу
     *
     * @param skiils Список навичок
     * @param name Ім'я
     * @param jobTitle Назва посади
     * @param level Рівень
     * @param dept Департамент
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор класу який викликає конструктор батьківського класу
     *
     * @param skiils Список навичок
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Базовий конструктор класу який викликає конструктор батьківсьокого класу та ініціалізує пустий список навичок
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає представлення класу у вигляді строки
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /**
     * Повертає список навичок
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список навичок
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає список навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
