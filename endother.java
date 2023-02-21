 public boolean endOther(String a, String b) {
 //convert the parameters to lower case so that we get uniformity in their case 
    String a1=a.toLowerCase();
     String a2=b.toLowerCase();  
     //we dont need for loop as we are accessing the characters directly 
     if(a1.length()>=a2.length()&&a1.substring(a1.length()-a2.length()).equals(a2)){
       return true;
     }
     if(a2.length()>=a1.length()&&a2.substring(a2.length()-a1.length()).equals(a1)){
       return true;
     }
  /for any other conditions 
     return false;
}
