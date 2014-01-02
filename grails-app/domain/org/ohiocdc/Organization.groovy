package org.ohiocdc

class Organization 
{
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
     
    static hasMany = [memberships: Membership, contacts: Person]

    static constraints = 
    {
        name blank: false, unique: true
        mailingAddress blank: false
        primaryContact blank: false
        geography InList: ['','Urban','Suburban','Appalachia']
        website url: true
    }
    
   
}
