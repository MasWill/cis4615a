// Rule 13 Input Output (FIO)
// FIO02 - Detect and handle file-related errors
// https://wiki.sei.cmu.edu/confluence/display/java/FIO02-J.+Detect+and+handle+file-related+errors

File file = new File("file");
if (!file.delete()) {
  // Deletion failed, handle error
}