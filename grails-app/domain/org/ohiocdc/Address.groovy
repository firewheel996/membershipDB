package org.ohiocdc

class Address 
{
    static searchable = true
    
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
        state inList: ["OH","AL","AK","AZ","AR","CA","CO","CT","DE","DC","FL","GA",
        "HI","ID","IL","IN","KA","KY","LA","ME","MD","MA","MI","MS","MO","MT","NE",
        "NV","NH","NJ","NM","MY","NC","ND","OK","OR","PA","RI","SC","SD","TN","TX",
        "UT","VT","VA","WA","WI","WY"]
        county()
        zip blank: false, size: 5..9
    }
}
