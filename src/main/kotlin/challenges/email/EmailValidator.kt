package challenges.email

interface EmailValidator {
    fun filterValidEmails(emails: List<String>): List<String>
}