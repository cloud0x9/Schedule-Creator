package ScheduleCreator.API;

/**
 * Interface for email API calls to MailJet.
 *
 * @author Ilyass Sfar
 *
 * Last Updated: 3/18/2020
 */
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public interface APIInterface {
    /**
     * Send email's using an API.
     *
     * @param _email The email that is being sent to, this comes from the user.
     * @param _message This is what is being sent in the email.
     * @return
     * @throws MailjetException
     * @throws MailjetSocketTimeoutException
     */
    public void SendEmail(String _email, String _message)throws MailjetException, MailjetSocketTimeoutException;
}
