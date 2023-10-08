// Rule 09 Locking 
// LCK00 - Use private final lock objects to synchronize classes that may interact with untrusted code
// https://wiki.sei.cmu.edu/confluence/display/java/LCK00-J.+Use+private+final+lock+objects+to+synchronize+classes+that+may+interact+with+untrusted+code

public class SomeObject {
  private final Object lock = new Object(); // private final lock object
 
  public void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}