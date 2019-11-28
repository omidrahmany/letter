package ir.maktab.java32.projects.lettermanagement.features.archiveletter.impl;

import ir.maktab.java32.projects.lettermanagement.core.annotations.Service;
import ir.maktab.java32.projects.lettermanagement.features.archiveletter.usecases.SubmitLetterByOfficialEmployeeUseCase;
import ir.maktab.java32.projects.lettermanagement.model.Letter;

@Service
public class SubmitLetterByOfficialEmployeeUseCaseimpl implements SubmitLetterByOfficialEmployeeUseCase {
    public Letter submit(String title, Long indicator, String privacy, String sender, String submitDate) throws SubmitLetterByOfficialEmployeeUseFailedException {
        validate(title);
        Letter letter = new Letter(
                null,
                indicator,
                title,
                privacy,
                sender,
                submitDate);
        // Todo: insert into database
        insertIntoDatabase(letter);
        return letter;
    }

    private void insertIntoDatabase(Letter letter) {
    }

    private void validate(String title) throws SubmitLetterByOfficialEmployeeUseFailedException{
       if (title.length()<=3){
           throw new SubmitLetterByOfficialEmployeeUseFailedException("Title length has to be more than 3 characters");
       }
    }



}
