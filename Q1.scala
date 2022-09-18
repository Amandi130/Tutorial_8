case class Point(x:Int,y:Int){
    val num1=x;
    val num2=y;

    def +(a:Point)=Point(this.x+a.x,this.y+a.y)
}

object Scala_1 extends App{
    val n=Point(2,8);
    val m=Point(3,7);
    val e=n+m;
    println(e)

    
}