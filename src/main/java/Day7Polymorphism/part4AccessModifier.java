package main.java.Day7Polymorphism;

public class part4AccessModifier {
    /*
    Access Level Table
| Access Modifier | Same Class | Same Package | Subclass (other package) | Other Package (non-subclass) |
| --------------- | ---------- | ------------ | ------------------------ | ---------------------------- |
| **public**      | YES        | YES          | YES                      | YES                          |
| **protected**   | YES        | YES          | YES                      | NO                           |
| **default**     | YES        | YES          | NO                       | NO                           |
| **private**     | YES        | NO           | NO                       | NO                           |


For classes (important interview point)

| Modifier  | Can be used for Class?               | Access level             |
| --------- | ------------------------------------ | ------------------------ |
| public    | YES                                  | Accessible from anywhere |
| default   | YES                                  | Only inside same package |
| protected | NO (not allowed for top-level class) | —                        |
| private   | NO (not allowed for top-level class) | —                        |




// Access level for method and variables

| Access Modifier | Same Class | Same Package | Subclass (other package) | Other Package (non-subclass) |
| --------------- | ---------- | ------------ | ------------------------ | ---------------------------- |
| **public**      | YES        | YES          | YES                      | YES                          |
| **protected**   | YES        | YES          | YES                      | NO                           |
| **default**     | YES        | YES          | NO                       | NO                           |
| **private**     | YES        | NO           | NO                       | NO                           |


Static method Access

| Modifier         | Same Class | Same Package | Subclass (diff pkg) | Other pkg |
| ---------------- | ---------- | ------------ | ------------------- | --------- |
| public static    | ✅          | ✅            | ✅                   | ✅         |
| default static   | ✅          | ✅            | ❌                   | ❌         |
| protected static | ✅          | ✅            | ✅                   | ❌         |
| private static   | ✅          | ❌            | ❌                   | ❌         |

     */
}
