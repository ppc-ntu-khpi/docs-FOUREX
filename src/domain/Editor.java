package domain;

/**
 * Клас редактора, що розширює клас художника і додає можливість редагування текстів.
 */
public class Editor extends Artist {

    /**
     * Конструктор класу редактора.
     *
     * @param electronicEditing Булеве значення, що вказує, чи використовує редактор електронні засоби редагування.
     * @param skills Список навичок редактора.
     * @param name Ім'я редактора.
     * @param jobTitle Назва посади редактора.
     * @param level Рівень редактора.
     * @param dept Департамент, в якому працює редактор.
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу редактора зі списком навичок.
     *
     * @param electronicEditing Булеве значення, що вказує, чи використовує редактор електронні засоби редагування.
     * @param skills Список навичок редактора.
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу редактора зі значенням для електронного редагування.
     *
     * @param electronicEditing Булеве значення, що вказує, чи використовує редактор електронні засоби редагування.
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Базовий конструктор класу редактора, який встановлює значення електронного редагування за замовчуванням (true).
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядок, що представляє клас редактора разом зі відомостями про тип редагування.
     *
     * @return Рядок із відомостями про редактора та його типом редагування.
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing)
            s += "electronic";
        else
            s += "paper";
        return s;
    }

    private boolean electronicEditing;

    /**
     * Повертає булеве значення, що вказує, чи використовує редактор електронні засоби редагування.
     *
     * @return true, якщо редактор використовує електронні засоби редагування, в іншому випадку - false.
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування для редактора.
     *
     * @param electronic Булеве значення, що вказує, чи використовує редактор електронні засоби редагування.
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}

  // Признаю, що на цьому етапі мені стало лінь і я звернувся до чату джіпіті :\
 // Зазначу, що я і без нього повністю розумію, що робить написаний код; також є деякі пропозиції що до нього
// Просто писати це все якось довго...
