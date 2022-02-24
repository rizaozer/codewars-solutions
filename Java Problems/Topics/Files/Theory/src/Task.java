// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
  }
  public static boolean areSiblings(File f1, File f2) {
    // implement me
    if(f1.getParent() == f2.getParent()) {
      return true;
    }
    return false;

  }
}
