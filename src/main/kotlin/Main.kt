// Importing all necessary modules below:
import java.awt.Desktop
import java.net.URI
import kotlin.system.exitProcess


fun main() {

    introduction()
    ccLicense()
    display()

    while (STATUS) {
        try {
            while (STATUS) {

                println()
                print("Enter your choice: ")

                val choice: Int = readln().toInt()
                println()

                if (choice >= 7 || choice <= 0)
                {
                    error()
                    break
                }

                // Executing Question 1:
                else if (choice == 1)
                {
                    println("Solve the following by adding the numbers: ")
                    println("1. (-11) + 15 + 17 + (-11)\n")

                    while (STATUS)
                    {
                        print("Enter your answer: ")
                        var ans: String = readln()

                        val s1 = (-11) + 15 + 17 + (-11)

                        if (ans.toInt() == s1)
                        {
                            println("Your answer is correct! Proceeding to the chapter selection...")
                            break
                        }
                        else
                        {
                            error2()
                        }
                    }

                    display()

                }
                // Executing Question 2:
                else if (choice == 2)
                {
                    println("Solve the following by subtracting the numbers:")
                    print("2. -2136 from 5761\n")

                    while (STATUS)
                    {
                        print("Enter your answer: ")
                        var ans: String = readln()

                        val s2 = -2136 - 5761

                        if (ans.toInt() == s2)
                        {
                            println("Your answer is correct! Proceeding to the chapter selection...")
                            break
                        }

                        else
                        {
                            error2()
                        }
                    }
                    display()
                }
                // Executing Question 3:
                else if (choice == 3)
                {
                    println("Solve the following by multiplying the numbers:")
                    print("3. 12 x (-2) x (-3) x (-5)\n")

                    while (STATUS)
                    {
                        print("Enter your answer: ")
                        var ans: String = readln()

                        val s3 = 12 * (-2) * (-3) * (-5)

                        if (ans.toInt() == s3) {
                            println("Your answer is correct! Proceeding to the chapter selection...")
                            break
                        }
                        else
                        {
                            error2()
                        }
                    }
                    display()

                }
                // Executing Question 4:
                else if (choice == 4)
                {
                    println("Solve the following by dividing the numbers:")
                    print("4. (-166375) / (-11) \n")

                    while (STATUS)
                    {
                        print("Enter your quotient: ")
                        var quotient: String = readln()

                        println()

                        print("Enter your remainder: ")
                        var remainder: String = readln()

                        println()
                        println("Your answer: Quotient = $quotient and Remainder = $remainder")


                        val s4: Double = (-166375.0) / (-11.0)
                        val s5: Double = (-166375.0) % (-11.0)

                        if (quotient.toDouble() == s4 && remainder.toDouble() == s5)
                        {
                            println("Your answer is correct! Proceeding to the chapter selection...")
                            break
                        } else {
                            error2()
                        }

                    }
                    display()

                }
                // Executing Question 5:
                else if (choice == 5)
                {
                    println("Solve the following algebraic mathematics: ")
                    print("5. 2x - (3x + 5) - 85 = -9x + (6x-5) + 9\n")

                    while(STATUS)
                    {

                        print("Enter your answer: ")
                        var ans: String = readln()
                        println()

                        if (ans.toDouble() == solve5())
                        {
                            println("Your answer is correct! Proceeding to the chapter selection...")
                            break
                        }

                        else
                        {
                            error2()
                        }
                    }
                    display()

                }

                // Executing exit:
                else
                {
                    print("Are you sure you want to exit? (Y/N): ")
                    var ans: String = readln()

                    if  (ans == "Y" || ans == "y")
                    {
                        println("Exiting the program...")
                        thanks()
                        exitProcess(0)
                    }

                    else if (ans == "N" || ans == "n")
                    {
                        println("Returning to chapter selection...")
                        continue
                    }

                    else
                    {
                        error3()
                    }

                }

            }
        } catch (e: Exception) {
            error3()
            continue
        }
    }

}



fun error()
{
    /*
    Display Error Message for Input out of Range when called. Also tells the user to try again.
    :return: Input out of range! Please try again!
    */

    println("Input out of range! Please try again!")

}


fun error2()
{
    /*
    Display Error Message for invalid answer when called. Also tells the user to try again.
    :return: Invalid answer! Please try again!
    */

    println("Invalid answer! Please try again!")

}


fun error3()
{
    /*
    Display Error Message for invalid input when called. Also tells the user to try again.
    :return: Invalid Input! Please try again!
    */

    println("Invalid Input. Please try again.")

}


fun thanks()
{
    /*
    Thanks the user after the system concludes.
    :return: Thank you for using our interactive system. We hope you enjoyed it!
    */


    println("Thank you for using our interactive system. We hope you enjoyed it!")

}



fun ccLicense() {
    val licenseURL = "https://pandora-dynamics.rf.gd/software-licenses/pandora-mathematics-5-cli-kotlin/LICENSE.html"

    try {
        Desktop.getDesktop().browse(URI(licenseURL))
    } catch (e: Exception) {
        println("Failed to open the license URL: ${e.message}")
    }
}


fun introduction()
{
    /*
    Introduction to the program.
    :return: introduction texts
    */

    println()
    println("Welcome to Pandora Mathematics - 5, an interactive mathematics program for 5th graders!")
    println("Version: 2.0 (Kotlin)")
    println()

}


fun display() {

    /*
    Displays chapters for the program.
    :return:
    */

    println("""
This interactive program contains the following chapters.
        
Press the respective numbers for their respective chapters to get their questions or press 6 to exit:

1. Addition    |    2. Subtraction    |    3. Multiplication 

4. Division    |    5. Algebra    |    6. Exit the program""")
}

fun solve5(): Double

{
    // 2x - (3x + 5) - 85 = -9x + (6x - 5) + 9
    // => 2x-3x-5-85 = -9x+6x-5+9
    // => -x-90 = -3x+4
    // => -x+3x = 90+4
    // => 2x = 94

    val x: Double = 94.0 / 2.0
    return x

}



const val STATUS: Boolean = true
