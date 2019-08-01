import java.io.File

object FileMatcher {
  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(query))

  def filesMatching(query: String, matcher: String => Boolean): Array[File] = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  private def filesHere = new File(".").listFiles()

  def filesContaining(query: String) =
    filesMatching(query, _.contains(query))

  def filesRegex(query: String) =
    filesMatching(query, _.matches(query))
}

object Simplifying {

  def containsNeq(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums) {
      if (num < 0)
        exists = true
    }
    exists
  }

  def containsNeqOptimized(nums: List[Int]): Boolean = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums) {
      if (num % 2 == 1)
        exists = true
    }
    exists
  }

  def containsOddOptimized(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)
}
