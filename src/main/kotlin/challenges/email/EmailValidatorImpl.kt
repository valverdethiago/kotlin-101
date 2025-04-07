package challenges.email

object EmailValidatorImpl : EmailValidator {
    private fun isValidEmail(email: String): Boolean {
        return email.matches(Regex("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
    }

    override fun filterValidEmails(emails: List<String>): List<String> {
        return emails.map { it.trim().lowercase() }
            .filter { isValidEmail(it) }
    }
}