fun main(args : Array<String>) {
    repeat(readLine()!!.toInt()){
        var n = readLine()!!.toInt()
        var A = readLine()!!.split(" ").map(String::toInt).toIntArray()
        var c = 0
        for(j in 0 until (2*n-1)){
            c = 0
            for(k in 0 until (2*n)){
                if(A[j]==A[k])
                    c++
            }
            if(c>=3){
                println("NO")
                break
            }
            
        }
        if(c<3)
            println("YES")
    }
}
