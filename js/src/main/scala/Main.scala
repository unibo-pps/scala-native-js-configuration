/**
 * to run this example type in the sbt shell:
 * project js
 * run
 * to create the .js file use:
 * fastOptJS
 * and then open the index.html file in the js folder
 */
@main def main(): Unit =
  println("Wow!! I am in js runtime!!")
  println(s"Random number : ${math.random()}")