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
    ProgramInvolvement involvement
    Address address
    String notes
    String recordStatus
    
    static hasOne = [org: Organization]
    
    static hasMany = [events: Event]

    static constraints = 
    {
        firstName blank: false
        lastName blank: false
        email Email: true
        position nullable: true
        org nullable: true
        officePhone size: 7..11, blank: false        
        cellPhone size: 7..11
        
        
    }
}
