package org.ohiocdc

class Address 
{
    String street
    String city
    String state
    String county
    String zip
    
    static belongsTo = [Person, Organization]

    static constraints = 
    {
        street blank: false
        city blank: false
        zip blank: false, size: 5..9
    }
}
