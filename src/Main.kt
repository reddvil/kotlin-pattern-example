import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var factory = FactoryProvider();
    val point1 = Point(5, 5);
    val point2 = Point(1, 5);
    val distance = point1.distance(point2)
    println(distance)
    println(point1 == point2);
}


data class Point(var x: Int, var y: Int) {

    fun movePoints() {
        this.x = this.x * -1
        this.y = this.y * -1
    }

    fun distance(point: Point): Double {
        return sqrt((x - point.x).toDouble().pow(2.0) + (y - point.y).toDouble().pow(2.0))
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            return this.x == other.x && this.y == other.y
        }
        return false
    }

    override fun toString(): String {
        return "x: " + this.x.toString() + "  y: " + this.y.toString();
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }


}
