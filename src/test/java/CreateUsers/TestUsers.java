package CreateUsers;

import RepeatOrder.Order;
import RepeatOrder.OrderCheck;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestUsers {
    Users user1 = new Users(15,"q",47, true, "MQA");
    Users user2 = new Users(47,"w",68, false, "QA");
    Users user3 = new Users(22,"e",55, false, "QE");
    Users user4 = new Users(35,"r",90, false, "QC");
    Users user5 = new Users(66,"t",120, true, "QA");
    Users user6 = new Users(99,"y",24, true, "QC");
    Users user7 = new Users(19,"u",75, false, "Tester");
    Users user8 = new Users(24,"i",86, true, "QE");
    Users user9 = new Users(27,"a",90, false, "QC");
    Users user10 = new Users(45,"s",80, false, "QA");
    Users user11 = new Users(32,"d",70, true, "AQA");
    Users user12 = new Users(68,"f",150, false, "GQA");
    Users user13 = new Users(77,"q",230, true, "ded");
    Users user14 = new Users(88,"w",101, false, "baba");
    Users user15 = new Users(1,"r",5, false, "child");
    List<Users> usersList = Arrays.asList(user1,user2,user3,user4,user5,user6,user7, user8, user9, user10, user11, user12, user13, user14, user15);

    @Test
    public void testUsersByAgeLessThan40(){
        System.out.println("Test Users by AgeLessThan40 ");
        printUsersConditions(usersList, users -> users.age <= 40);

    }
    @Test
    public void testUsersByAgeMoreThan40(){
        System.out.println("Test Users by AgeMoreThan40 ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 40;
            }
        });

    }
    @Test
    public void testUsersBySex(){
        System.out.println("Test Users by Sex ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.sex;
            }
        });

    }
    @Test
    public void testUsersByWeight(){
        System.out.println("Test Users by Weight ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.weight >= 40;
            }
        });

    }
    @Test
    public void testUsersBySpeciality(){
        System.out.println("Test Users by Speciality ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.speciality.equals("QA");
            }
        });

    }
    @Test
    public void testUsersBySexAndAge(){
        System.out.println("Test Users by Sex and age ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 20 && users.sex;
            }
        });

    }
    @Test
    public void testUsersByAgeAndName(){
        System.out.println("Test Users by age and name ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 80 && users.name.equals("r");
            }
        });

    }
    @Test
    public void testUsersByName(){
        System.out.println("Test Users by name ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.name.equals("q");
            }
        });

    }
    @Test
    public void testUsersByNameAndSex(){
        System.out.println("Test Users by name and sex ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.name.equals("r") && !users.sex;
            }
        });

    }
    @Test
    public void testUsersBySexAndSpeciality(){
        System.out.println("Test Users by sex and speciality ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return !users.sex && !users.speciality.equals("t");
            }
        });

    }
    @Test
    public void testUsersByWeightAndAge(){
        System.out.println("Test Users by weight and age ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 32 && users.weight == 47;
            }
        });

    }
    @Test
    public void testUsersByAgeAndWeightAndName(){
        System.out.println("Test Users by age weight name ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 40 && users.weight < 100 && users.name.equals("e");
            }
        });

    }
    @Test
    public void testUsersByAgeAndWeightAndSex(){
        System.out.println("Test Users by age weight sex ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 40 && users.weight >= 60 && !users.sex;
            }
        });

    }
    @Test
    public void testUsersByAgeAndWeightAndSexAndName(){
        System.out.println("Test Users by age weight sex name ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 40 && users.weight >20 && !users.sex && users.name.equals("y");
            }
        });

    }
    @Test
    public void testUsersByAll(){
        System.out.println("Test Users by all ");
        printUsersConditions(usersList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(Users users) {
                return users.age >= 50 && users.weight >20 && users.sex && users.name.equals("e");
            }
        });

    }
    public void printUsersConditions(List<Users> usersList, UsersCheck usersCheck){
        for(Users users : usersList){
            if(usersCheck.checkUserConditions(users)){
                System.out.println(users);
            }
        }

    }

}
