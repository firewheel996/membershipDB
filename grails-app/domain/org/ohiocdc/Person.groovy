package org.ohiocdc

class Person 
{
    String firstName
    String lastName
    String email
    String officePhone
    String cellPhone
    String position
    Date added = new Date()
    
    Address address
    String notes
    
    static hasOne = [org: Organization]
    
    static hasMany = [events: Event]

    static constraints = 
    {
        firstName blank: false
        lastName blank: false
        email Email: true
        officePhone size: 7..11, blank: false
        org nullable: true
        position nullable: true
        cellPhone size: 7..11
        
        
    }
}
