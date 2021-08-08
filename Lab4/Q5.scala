object Q5 {
  def main(args:Array[String])
  {
    println("inline")
   var va:Int=10
    def inc(x:Int): Int =x+1
    va=inc(va)
    printf("Answer after increment "+va)
  }
}