void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 

  int max = 10;

  if (i > max)
  {
    String output = "i is greater than "+max+".";   
    // } Den her curly brace stopper output

    println(output);
  }
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 

{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekEnd = false;
  
  if (weekDay < 5)
  {
    weekEnd = false;
  }
  else 
  {
    weekEnd = true;
  }
  
  // Print the name of the weekday here: 
  
  println(weekDay);
    
  // Print if it is weekend here:
  
  if (weekEnd) {
    println("It's the weekend!");
  } else {
    println("It's not weekend yet!:(");
  }
}
