case class Point(x:Int,y:Int){
    val num1=x;
    val num2=y;

    def inverse()=Point(this.num2,this.num1)
}

object Scala_4 extends App{
    val s=Point(2,3)
    val d=s.inverse
    print(d)
}