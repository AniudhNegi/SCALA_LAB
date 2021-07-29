

object Operator {
  def main(args: Array[String]){
    
    var a = 100;
    var b = 30;
    var c = true;
    var d = false; 
    var res = 0;
    
    println("Addition: "+(a+b));
    println("Substraction: "+(a-b));
    
    if(a==b)
      println("EQUAL");
    else
      println("NOT EQUAL");
    
    println("Logical Or of c || d = " + (c || d));
     
    println("Bitwise And of a & b = " + (a & b));
    
  }
}