/**
 * Created by arincon on 4/03/15.
 */
object BerlinClock {
  def seconds(number: Int) = number % 2 match {
    case (0) => "Y"
    case _ => "O"
  }

}
