package scalalinq

/**
 * @author Vladimir Kirichenko <vladimir.kirichenko@gmail.com>
 */

object linq {
  implicit def from[A](s: Seq[A]) = new linq(s);
  def self[A] = (x: A) => x
}

class linq[A](seq: Seq[A]) {
  def where(p: A => Boolean) = seq filter p

  def select[B](p: A => B) = seq map p

  def orderby[B <% Ordered[B]](f: A => B) = seq.toList sort ((a, b) => f(a) < f(b))

  def ascending = seq

  def descending = seq reverse
}
