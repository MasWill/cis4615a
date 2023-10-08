// Rule 10 Thread APIs
// THI00 - Do not invoke Thread.run()
// https://wiki.sei.cmu.edu/confluence/pages/viewpage.action?pageId=88487912&src=contextnavpagetreemode

public final class Foo implements Runnable {
  @Override public void run() {
    // ...
  }
 
  public static void main(String[] args) {
    Foo foo = new Foo();
    new Thread(foo).start();
  }
}