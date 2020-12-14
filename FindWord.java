public class FindWord{

  //define inputs and nesscarry logic varibles
  private String hWord;
  private String guess;

  private String rString = "[";
  private boolean match = false;
  private boolean plus = false;

  //make sure input is all caps
  public FindWord(String h){
    hWord = h.toUpperCase();
  }

  //start getClue
  public String getClue (String g){
    //convert guess to all caps
    guess = g.toUpperCase();
    rString = "[";

    // go through list of all char in hWord
    for(int i = 0; i < hWord.length(); i++){
      //go through list of all char in guess
      plus = false;
      for(int v = 0; v < guess.length(); v++){
        //reset match for future use
        match = false;

        // figure out if letter should be char or +
        if (hWord.charAt(i) == guess.charAt(v)){
          // if the char is the same in the same position in both guess and hWord the add char
          if(i == v){
            //append correct char
            rString = rString + hWord.charAt(i);
            //stops the 2nd lvl for loop
            v = guess.length() + 5;
            //tells future code to not add an *
            match = true;
            plus = false;
          }else{
            plus = true;
            match = true;
          }
        }
      }

      if(plus == true){
        rString = rString + "+";
      }
      
      if(match == false){
        //add an * if no match is found
        rString = rString + "*";
      }
    }
    //return the final string - [
    return rString.substring(1);
  } 
  public String getHiddenWord(){return hWord;}
}