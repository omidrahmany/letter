package ir.maktab.java32.projects.lettermanagement;

import ir.maktab.java32.projects.lettermanagement.features.archiveletter.impl.SubmitLetterByOfficialEmployeeUseCaseimpl;
import ir.maktab.java32.projects.lettermanagement.features.archiveletter.usecases.SubmitLetterByOfficialEmployeeUseCase;
import ir.maktab.java32.projects.lettermanagement.model.Letter;

import java.util.*;

public class LetterManagementApplication {
    public static void main(String[] args) {


        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        while (!exit) {
            System.out.println("What do you want: ");
            String command = scanner.nextLine();
            if (command.equals(exit)) {
                exit = true;
            }

            if (command.equals("submit")) {
                SubmitLetterByOfficialEmployeeUseCase submitLetterByOfficialEmployeeUseCase
                        = new SubmitLetterByOfficialEmployeeUseCaseimpl();
                System.out.println("Title: ");
                String title = scanner.nextLine();
                System.out.println("Indicator:");
                Long indicator = scanner.nextLong();
                System.out.println("Sender:");
                String sender = scanner.nextLine();
                System.out.println("Submit Date:");
                String submitDate = scanner.nextLine();
                System.out.println("Privacy:");
                String privacy = scanner.nextLine();
                try {
                    Letter letter = submitLetterByOfficialEmployeeUseCase.submit(
                            title,
                            indicator,
                            privacy,
                            sender,
                            submitDate);
                } catch (SubmitLetterByOfficialEmployeeUseCase.SubmitLetterByOfficialEmployeeUseFailedException e) {
                    System.out.println("Error" + e.getMessage());
                }
            }
        }
    }
}
