// Rule 07 Exceptional Behavior
// ERR00 - Do not suppress or ignore checked exceptions
// https://wiki.sei.cmu.edu/confluence/display/java/ERR00-J.+Do+not+suppress+or+ignore+checked+exceptions

boolean validFlag = false;
do {
  try {
    // ...
    // If requested file does not exist, throws FileNotFoundException
    // If requested file exists, sets validFlag to true
    validFlag = true;
  } catch (FileNotFoundException e) {
    // Ask the user for a different file name
  }
} while (validFlag != true);
// Use the file