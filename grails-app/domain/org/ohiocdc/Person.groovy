package org.ohiocdc

class Person 
{
    static searchable = true
    
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
    
    static hasMany = [events: Event, memberships: Membership]

    static constraints = 
    {
        firstName blank: false
        lastName blank: false
        email Email: true
        address()
        recordStatus inList: ["Friend - Non Member", "Prospective Member", "Priority Prospective Member", "Member"]
        position nullable: true
        org nullable: true
        events nullable: true
        memberships nullable: true
        officePhone size: 7..11, blank: false        
        cellPhone size: 7..11
        notes widget: 'textarea'
        added editable: false        
    }
}
