
fun main(args: Array<String>) {

    val i = 0


    val informationlist = ArrayList<Person>()
    var name: String = readln()
    var Lastname: String = readln()
    var phonenumber: String = readln()
    var email: String= readln()

    informationlist.add(Person(name, Lastname, phonenumber, email))

        for (elements in informationlist){
            println(" Firstname:" + elements.firstname +
                    " Lastname:" + elements.surname + " " +
                    "phonenumber" + elements.phonenumber +
                    " Email:" + elements.email)
        }

}
fun meny(args: Array<String>){
    println("1. Add contact" +
            "2. Remove contact" +
            "3. Change contact" +
            "4. Show Contacts" +
            "5. Show in alphabetical order" +
            "6. Save contacts to file" +
            "7. Read contacts from file")
}