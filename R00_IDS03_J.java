// Rule 00 Input validation and data sanitization
// IDS03 - Do not log unsanitized user input

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}