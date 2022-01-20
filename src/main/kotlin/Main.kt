val informationlist = ArrayList<Person>()
var name: String = ""
var Lastname: String = ""
var phonenumber: String = ""
var email: String = ""
var choice: String = ""

fun meny()
{
    println("1. Add contact" +
            "2. Remove contact" +
            "3. Change contact" +
            "4. Show Contacts" +
            "5. Show in alphabetical order" +
            "6. Save contacts to file" +
            "7. Read contacts from file")
}

fun show_contacts()
{
    for (elements in informationlist){
        println(" Firstname:" + elements.firstname +
                " Lastname:" + elements.surname + " " +
                "phone-number" + elements.phonenumber +
                " Email:" + elements.email)
    }
}

fun add_contact(){
    println("Please write name, lastname, phonenumber and email on individual lines to add a person. Iff succeded, skapad kontakt wil be displayed ")
    informationlist.add(Person(name, Lastname, phonenumber, email))
}

fun remove_contact()
{
    println("Please write the email adress of the person that you arte trying to remove")
    var email_adress: String = readln()
    for (number: Int in 0..informationlist.count())
    {
        if (email_adress == informationlist[number].email)
        {
            informationlist.removeAt(number)
       }
    }
}

fun Show_in_alphabeticall_order()
{
    var sortedList = informationlist.sortedWith(compareBy({ it.email }))
}

fun Read_to_file()
{
    //Help Jonas

}

fun Save_to_file()
{
    //Help Jonas
}

fun choose_option()
{
    when(choice)
    {
        1 -> add_contact()
        2 -> remove_contact()
        3 -> null
        4 -> show_contacts()
        5 -> Show_in_alphabeticall_order()
        6 -> Save_to_file()
        7 -> Read_to_file()
        else -> {
            println("please choose another number")
        }
}
fun main(args: Array<String>)
{
    meny()
    choice = readln()
    choose_option()
}