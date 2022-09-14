void setup() {
  size(300, 300);
  // Name/Age/Saying
  println("");
  printString("What's up!");
  introduce("Sebastian", 19);
}


void printString(String str) {
 println(str); 
}


void introduce(String name, int age) {
  printString("My name is " + name + ", I am " + age + " years old");
}
