package CreateUsers;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestUsers {
    User user1 = new User(15, "q", 47, true, "MQA");
    User user2 = new User(47, "w", 68, false, "QA");
    User user3 = new User(22, "e", 55, false, "QE");
    User user4 = new User(35, "r", 90, false, "QC");
    User user5 = new User(66, "t", 120, true, "QA");
    User user6 = new User(99, "y", 24, true, "QC");
    User user7 = new User(19, "u", 75, false, "Tester");
    User user8 = new User(24, "i", 86, true, "QE");
    User user9 = new User(27, "a", 90, false, "QC");
    User user10 = new User(45, "s", 80, false, "QA");
    User user11 = new User(32, "d", 70, true, "AQA");
    User user12 = new User(68, "f", 150, false, "GQA");
    User user13 = new User(77, "q", 230, true, "ded");
    User user14 = new User(88, "w", 101, false, "baba");
    User user15 = new User(1, "r", 5, false, "child");
    List<User> userList = Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12, user13, user14, user15);

    @Test
    public void testUsersByAgeLessThan40() {
        System.out.println("Test User by AgeLessThan40 ");
        printUsersConditions(userList, user -> user.age <= 40);

    }

    @Test
    public void testUsersByAgeMoreThan40() {
        System.out.println("Test User by AgeMoreThan40 ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 40;
            }
        });

    }

    @Test
    public void testUsersBySex() {
        System.out.println("Test User by Sex ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.sex;
            }
        });

    }

    @Test
    public void testUsersByWeight() {
        System.out.println("Test User by Weight ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.weight >= 40;
            }
        });

    }

    @Test
    public void testUsersBySpeciality() {
        System.out.println("Test User by Speciality ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.speciality.equals("QA");
            }
        });

    }

    @Test
    public void testUsersBySexAndAge() {
        System.out.println("Test User by Sex and age ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 20 && user.sex;
            }
        });

    }

    @Test
    public void testUsersByAgeAndName() {
        System.out.println("Test User by age and name ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 80 && user.name.equals("r");
            }
        });

    }

    @Test
    public void testUsersByName() {
        System.out.println("Test User by name ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.name.equals("q");
            }
        });

    }

    @Test
    public void testUsersByNameAndSex() {
        System.out.println("Test User by name and sex ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.name.equals("r") && !user.sex;
            }
        });

    }

    @Test
    public void testUsersBySexAndSpeciality() {
        System.out.println("Test User by sex and speciality ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return !user.sex && !user.speciality.equals("t");
            }
        });

    }

    @Test
    public void testUsersByWeightAndAge() {
        System.out.println("Test User by weight and age ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 32 && user.weight == 47;
            }
        });

    }

    @Test
    public void testUsersByAgeAndWeightAndName() {
        System.out.println("Test User by age weight name ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 40 && user.weight < 100 && user.name.equals("e");
            }
        });

    }

    @Test
    public void testUsersByAgeAndWeightAndSex() {
        System.out.println("Test User by age weight sex ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 40 && user.weight >= 60 && !user.sex;
            }
        });

    }

    @Test
    public void testUsersByAgeAndWeightAndSexAndName() {
        System.out.println("Test User by age weight sex name ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 40 && user.weight > 20 && !user.sex && user.name.equals("y");
            }
        });
    }

    @Test
    public void testUsersByAll() {
        System.out.println("Test User by all ");
        printUsersConditions(userList, new UsersCheck() {
            @Override
            public boolean checkUserConditions(User user) {
                return user.age >= 50 && user.weight > 20 && user.sex && user.name.equals("e");
            }
        });

    }

    public void printUsersConditions(List<User> userList, UsersCheck usersCheck) {
        for (User user : userList) {
            if (usersCheck.checkUserConditions(user)) {
                System.out.println(user);
            }
        }

    }

}
