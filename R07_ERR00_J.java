// Rule 07 Exceptional Behavior
// ERR00 - Do not suppress or ignore checked exceptions
// https://wiki.sei.cmu.edu/confluence/display/java/ERR00-J.+Do+not+suppress+or+ignore+checked+exceptions

try {
  //...
} catch (IOException ioe) {
  ioe.printStackTrace();
}