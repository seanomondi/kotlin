fun main(){
    var maths: Int = 52
    var chemistry: Int = 85
    var physics: Int = 56
    var biology: Int = 74

    val total: Int = maths + chemistry + physics + biology
        if (total>=400){
            println("invalid input")
        }
        else{
            println("Total: " + total)
        }

    val mean: Int = total / 4

    if (mean>=100){
        println("invalid input")
    }
    else{
        println("Mean: " + mean)
    }

    if (mean>=100){
        println("invalid input")
    }
    else if (mean>=91){
        println("Grade: A")
    }
    else if (mean>=84){
        println("Grade: A-")
    }
    else if (mean>=74){
        println("Grade: B+")
    }
    else if (mean>=64){
        println("Grade: B")
    }
    else if (mean>=54){
        println("Grade: B-")
    }
    else if (mean>=44){
        println("Grade: C+")
    }
    else if (mean>=34){
        println("Grade: C")
    }
    else if (mean>=24){
        println("Grade: C-")
    }
    else if (mean>=20){
        println("Grade: D+")
    }
    else if (mean>=15){
        println("Grade: D")
    }
    else if (mean>=10){
        println("Grade: D-")
    }
    else{
        println("Grade: E")
    }
}