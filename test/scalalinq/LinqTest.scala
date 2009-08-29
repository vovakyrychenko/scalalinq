package scalalinq

/**
 * @author Vladimir Kirichenko <vladimir.kirichenko@gmail.com>
 */

object LinqTest extends Application {
  import linq._
  val list = 1 :: 6 :: 3 :: 2 :: 5 :: Nil
  var result: Seq[Int] =  from (list) where (_ % 2 == 1) select (_ * 2) orderby self ascending;
  println(result)
  result =  from (list) where (_ % 2 == 1) select (_ * 2) orderby self descending;
  println(result)
}