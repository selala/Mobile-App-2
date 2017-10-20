fun main(args: Array<String>) {
    for (i in 1..5){ //i = 1
        for (x in i..4){
            print(" ")
        }
        for (y in 1..i) {
            print("*")
        }
        println()
    }
}

