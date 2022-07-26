package CreateUsers;

public class Users {
    int age;
    String name;
    int weight;
    boolean sex;
    String speciality;

    public Users(int age, String name, int weight, boolean sex, String speciality) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;
    }
    @Override
    public String toString(){
        if (sex == true){
            return "age = " + age +
                    ", name = " + name +
                    ", weight = " + weight +
                    ", sex = male" +
                    ", speciality " + speciality;
        }
        else
            return "age = " + age +
                    ", name = " + name +
                    ", weight = " + weight +
                    ", sex = female" +
                    ", speciality " + speciality;


    }
}
