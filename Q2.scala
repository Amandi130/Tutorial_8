case class Point(x:Int,y:Int){
    val num1=x;
    val num2=y;

    def +(a:Point)=Point(this.x+a.x,this.y+a.y)
}

object Scala_2 extends App{
    val x=Point(3,8)
    println("Enter moving point:")
    print("Enter dx:")
    val a=scala.io.StdIn.readInt();
    print("Enter dy:")
    val b=scala.io.StdIn.readInt();
    val y=Point(a,b)
    println(x+y)
    
    
}