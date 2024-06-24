object expressions2 {
  private def e2(): (Int, Int, Float, Int, Int) ={
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f
    var g: Float = 0.0F

    b-=1
    val exprA = b*a + c*d
    d-=1
    val exprB = a
    a+=1
    val exprC = -2 * (g-k) + c
    val exprD = c
    c+=1
    c+=1
    val exprF = c*a
    a+=1

    (exprA, exprB, exprC, exprD, exprF)
  }

  def main(args: Array[String]): Unit = {
    val (a, b, c, d, f) = e2()
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
  }
}
