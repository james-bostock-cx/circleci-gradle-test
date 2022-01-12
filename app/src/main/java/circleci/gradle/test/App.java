/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package circleci.gradle.test;

import java.io.File;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("Deleting " + args[0]);
        File f = new File(args[0]);
        try {
            f.delete();
        } catch (Exception e) {
            System.err.println("Cannot remove " + args[0] + ": " + e.getMessage());
        }
    }
}
