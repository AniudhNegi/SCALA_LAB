

object addition {
  def main(args: Array[String]){
    println("Sum: " +varAdd(12,484));
    println("Sum: "+valAdd(821,23));
  }
  
  //mutable values
  def varAdd(x:Int, y:Int) : Int = {
    var sum:Int = 0
    
    sum = x + y;
    
    return sum;
  }
  
  // immutable values
  def valAdd(a:Int, b:Int) : Int = {
    
    val sum = a + b;
    
    return sum;
  }
}