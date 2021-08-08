

object EvenAndOdd {
  
  def main(args:Array[String])
  {
    println("10 is even or odd ?")
    cmp(10);
  }
  def cmp(a:Int)={
    eve()
    def eve()={
      if(a%2==0)
      {
        println(a+" is even")
      }
      else
      {
        println(a+" is odd")
      }
    }
  }
}
