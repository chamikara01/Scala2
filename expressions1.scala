object expressions1 {
  private def e1(): (Int, Int, Int, Int, Float, Int) = {
    var k: Int = 2
    var i: Int = 2
    var j: Int = 2
    var m: Int = 5
    var n: Int = 5
    var f: Float = 12.0F
    var g: Float = 4.0F
    var c: Char = 'X'

    val exprA = k + 12 * m
    val exprB = m / j
    val exprC = n % j
    val exprD = m / j * j
    val exprF = f + 10*5 +g
    i += 1
    val exprG = i * n

    (exprA, exprB, exprC, exprD, exprF, exprG)
  }

  def main(args: Array[String]): Unit = {
    val (a, b, c, d, f, g) = e1()
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(g)
  }
}

