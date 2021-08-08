object MaxMin {
 def main(args: Array[String])
{
println("To Find Min and Max from 20, 15")
maxAndMin(20, 15);
}
// Function
def maxAndMin(a: Int, b: Int) = {
//NestedFunction01
 def findmax()={
// Nested Function 02
def maxValue() = {
if(a > b)
{
println("Max is: " + a)
}
else
{
println("Max is: " + b)
}
}
 }
 // Nested Function 01
def findmin()={
// Nested Function 02
def minValue() = {
if (a < b)
{
println("Min is: " + a)
}
else
{
println("Min is: " + b)
}
}
}
findmax();
findmin();
}
}
