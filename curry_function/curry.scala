def sum(f:Int=>Int)(a:Int,b:Int):Int={
    if(a>b) 0
    else f(a)+sum(f)(a+1,b)
}
def product(f:Int=>Int)(a:Int,b:Int):Int={
    if(a>b) 1
    else f(a)*product(f)(a+1,b)
}
def fact(n:Int):Int={
    product(x=>x)(1,n)
}
def mapReduce(f:Int=>Int,combine:(a:Int,b:Int)=>Int,zero:Int)(a:Int,b:Int):Int={
    if(a>b) zero
    else combine(f(a),mapReduce(f,combine,zero)(a+1,n))
}