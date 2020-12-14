public class AdditionPattern{
  //Set Variables
  private int start;
  private int mid;
  private int inc;
  //Constructor to set a start, increment, and current value
  public AdditionPattern(int start, int inc){
    this.start = start;
    this.mid = this.start;
    this.inc = inc;
  }
  //Moves to the next number in the increment
  public void next(){mid += inc;}
  //Moves to the previous increment unless that drops under start value
  public void prev(){
    if (mid - inc < start){
      System.out.println("There is no previous number!");
      }
    else{
      mid -= inc;
      } 
    }
  //Returns current number
  public int currentNumber(){return mid;}
}