import java.time.*;


class Person{
    String name;
    int age;
    private double weight;
    private double height;
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name,LocalDate birthDate){
        this.name = name;
        this.age = getAge(birthDate);
    }

    public int getAge(LocalDate birthdate){
        return Period.between(birthdate,LocalDate.now()).getYears();
    }

    public double getBMI(){
        return weight/Math.pow(height/100,2);
    }
    public String getBMIHelp(){
        return "BMI Categories:\n" +
                "Underweight = <18.5\n" +
                "Normal weight = 18.5-24.9\n" +
                "Overweight = 25-29.9\n" +
                "Obesity = BMI of 30 or greater";
    }
}
public class BodyMassIndex {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2004, 12, 10);
        Person p1 = new Person("Ali", birthDate);
        p1.setWeight(77);
        p1.setHeight(177.8);
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println(p1.getBMIHelp());
        System.out.println("BMI: " + p1.getBMI());

    }
}
