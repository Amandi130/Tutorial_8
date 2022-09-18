case class Point(x:Int,y:Int){
    val num1=x;
    val num2=y;

    def dest(a:Point)=Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2))
}
object Scala_1 extends App{
    val n=Point(2,8);
    val m=Point(3,7);
    printf("Distance between "+Point(2,8)+" and "+Point(3,7)+":")
    val e=n dest (m);
    println(e)

    
}