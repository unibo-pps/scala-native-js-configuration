/**
 * to run this example type in the sbt shell:
 * project native
 * run
 * to create the .js file use:
 * nativeLink
 * and then in a terminal execute:
 * ./native/target/scala-3.1.2/native-out
 */

@main def main(): Unit =
  println("Wow!! I am in js runtime!!")
  println(s"Random number : ${math.random()}")