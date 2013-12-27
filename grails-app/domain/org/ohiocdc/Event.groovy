package org.ohiocdc

class Event 
{
    String name
    Date date

    static constraints = 
    {
        name blank: false
        date blank: false
    }
}
