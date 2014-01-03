package org.ohiocdc

class Organization 
{
    static searchable = true
    
    String name
    String phone
    String fax
    URL website
    Address mailingAddress
    Address physicalAddress
    Person primaryContact
    Date added = new Date()
    String geography
    String notes
    ProgramInvolvement involvement
    String recordStatus
     
    static hasMany = [memberships: Membership, contacts: Person, events: Event]

    static constraints = 
    {
        importFrom Person, include: ["recordStatus", "involvement", "added", "notes", "events", "memberships"]
        
        name blank: false, unique: true
        recordStatus()
        mailingAddress blank: false
        primaryContact blank: false
        phone size: 7..11, blank: false
        fax size: 7..11
        website url: true
        contacts nullable: true
        memberships()
        geography InList: ['','Urban','Suburban','Appalachia']
        involvement()
        events()
        notes()
        added()
    }
    
   
}
