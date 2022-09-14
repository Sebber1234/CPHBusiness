boolean happy = true;

 void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   
   println(sum(2, 2));
   println(toUpper("What's up"));
   println(isFirstUpper("What's up"));
}

boolean iAmHappy(){
  // fill out what is missing here: 
  return happy;
}

int sum(int a, int b) {
  return a + b;
}

String toUpper(String str) {
  return str.toUpperCase();
}

boolean isFirstUpper(String str) {
  return Character.isUpperCase(str.charAt(0)); 
}
