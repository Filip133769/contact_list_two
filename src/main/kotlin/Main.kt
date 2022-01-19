
fun main(args: Array<String>) {


    val informationlist = ArrayList<Person>()
    var name: String = readLine()
    var Lastname: String = readLine()
    var phonenumber: Int = readLine()
    var age: Int = readLine()
    var age: Int = readLine()

    informationlist.add(Person(name, Lastname, phonenumber = 0"Hasse@gmail.com")
            informationlist.add(Person(name, Lastname, age, "Hasse.Andersson@gmail.com"))

        for (elements in informationlist){
            println(" Firstname:" + elements.firstname +
                    " Lastname:" + elements.surname + " " +
                    "phonenumber" + elements.phonenumber +
                    " Email:" + elements.email)
        }

}