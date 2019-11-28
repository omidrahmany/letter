package ir.maktab.java32.projects.lettermanagement.features.archiveletter.usecases;

import ir.maktab.java32.projects.lettermanagement.core.annotations.UseCase;
import ir.maktab.java32.projects.lettermanagement.model.Letter;

@UseCase(code = "808")
public interface SubmitLetterByOfficialEmployeeUseCase {
    Letter submit(String title,
                  Long indicator,
                  String privacy,
                  String sender,
                  String submitDate
                  )
            throws SubmitLetterByOfficialEmployeeUseFailedException;

    class SubmitLetterByOfficialEmployeeUseFailedException extends Exception {
        private String message;

        public SubmitLetterByOfficialEmployeeUseFailedException(String message) {
            this.message = message;
        }
    }

}
