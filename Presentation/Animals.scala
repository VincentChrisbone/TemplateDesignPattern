object Animals extends App{

    var bird1 = new bird("parrot","blue")

    var seabird1  = new seabird("pengiun","white")

    var fish1 = new fish("goldfish","gold")

    println(s"\n\t\tCREATING  NEW Animal called ${bird1.name}\n")
    println(s"Hi,My name is ${bird1.name} I am ${bird1.color} in complextion, My favorite food is ${bird1.eat} and i can ${bird1.fly} ")
    
    println(s"\n\t\tCREATING  NEW Animal called ${seabird1.name}\n")
    println(s"Hi,My name is ${seabird1.name} I am ${seabird1.color} in complextion, My favorite food is ${seabird1.eat} and i can ${seabird1.fly} and ${seabird1.swim}")
    
    println(s"\n\t\tCREATING  NEW Animal called ${fish1.name}\n")
    println(s"Hi,My name is ${fish1.name} I am ${fish1.color} in complextion, My favorite food is ${fish1.eat} and i can ${fish1.swim} \n")
    
}

 class bird(override val name: String, override val color: String) extends Animal with flyer{
    override def eat:String = "seeds"
    override val fly: String = "fly"
}   
 class fish( override val name: String,override val color: String) extends Animal with swimmer{
    override def eat:String = "rice"
    override val swim: String = "swim"
}
 class seabird(override val name: String,override val color: String) extends Animal with swimmer with flyer{
    override def eat:String = "seed/rice"
    override val swim: String = "swim"
    override val fly: String = "fly"
    
}