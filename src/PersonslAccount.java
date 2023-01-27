public class PersonslAccount {
    private String name;
    private String day;
    private String month;
    private int year;
    private String mail;
    private String phoneNumber;
    private String lastName;
    private double weight;
    private double enforcement;
    private int numberOfSteps;
    private int age;

    public PersonslAccount(String name, String day, String month, int year, String mail, String phoneNumber, String lastName, double weight, double enforcement, int numberOfSteps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.weight = weight;
        this.enforcement = enforcement;
        this.numberOfSteps = numberOfSteps;
        this.age = 2020 - this.year;
    }
    public String getName(){
        return name;
    }
    public String getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public String getMail() {
        return mail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setEnforcement(double enforcement){
        this.enforcement = enforcement;
    }
    public void setNumberOfSteps(int numberOfSteps){
        this.numberOfSteps = numberOfSteps;
    }
    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Ім'я та прізвище: " + this.name + "" + this.lastName);
        System.out.println("Дата народження: " + this.day + "." + this.month + "." + this.year);
        System.out.println("Емейл: " + this.mail);
        System.out.println("Номер телефону: " + this.phoneNumber);
        System.out.println("Вага: " + this.weight);
        System.out.println("Тиск: " + this.enforcement);
        System.out.println("Кількість пройдених за день кроків: " + this.numberOfSteps);
        System.out.println("Вік: " + this.age);
    }
}
