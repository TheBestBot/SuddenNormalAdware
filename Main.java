import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Welcome the user and find which game they would like to play
    boolean clownUser = true;
    int plesBeGood = 3;
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome! You have the option to pick two games today!\n1. Find the word\n2. Addition Pattern\nPlease enter the number of the game you would like to play: ");
    //Loop to verify and force good input
    while(clownUser){
      plesBeGood = in.nextInt();
      //if 1 or 2 picked, break from loop
      try{
        assert (plesBeGood == 1 || plesBeGood == 2) : "Invalid input";
        clownUser = false;
      }
      catch(Exception e){
        System.out.println("Ding dong your input is wrong\nEnter a 1 for the word game or a 2 for the addition pattern");
      }
    }

    if(plesBeGood == 1){
      //Start word game
      FindWord urBad = new FindWord("VOID METHOD");

      boolean ja = true;
      while(ja){
        System.out.println("Please enter a starting guess of " + urBad.getHiddenWord().length() + "letters: ");
        String userGuess = in.nextLine();
        System.out.println(urBad.getClue(userGuess));

        if (urBad.getClue(userGuess).equals(userGuess.toUpperCase())){
          //right
          System.out.println("Congrats! You cracked the code!");
          ja = false;
        }else{
          //ur bad
          System.out.println("You got it wrong. Try Again!");
        }
      }
    }
    else{
      //addition pattern thing
      System.out.println("Please enter a starting value for your pattern: ");
      int startin = in.nextInt();
      System.out.println("Now enter how much you would like to add each time: ");
      int add = in.nextInt();
      //call after set up
      AdditionPattern a = new AdditionPattern(startin, add);
      boolean cierto = true;
      //loop so as long as user doesn't select to stop it keeps going
      while(cierto){
        System.out.println("Here are your options:\n1. Find Current Number\n2. Find Next Number\n3. Find Previous Number\n4. Exit the Addition Pattern");
        int opt = in.nextInt();
        if(opt == 1){System.out.println("The current number is " + a.currentNumber());}
        else if(opt == 2){a.next();
        System.out.println("Moving to the next in the sequence...");}
        else if(opt == 3){a.prev();
        System.out.println("Going backwards...");}
        else if(opt == 4){cierto = false;}
        else{System.out.println("That was not a valid input, please enter a valid input.");}
      }
      System.out.println("Thank you for using the Addition Pattern!");
    }
  }
}
