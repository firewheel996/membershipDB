package org.ohiocdc

class Membership implements Comparable
{
    String level
    Date entry = new Date()
    Date expiration = makeExpiration()
    boolean voting = false
    
    static belongsTo = [org: Organization]

    static constraints = 
    {
       level inList: ['OACAA','V1-Exch','V1-175','V2-225','V3-325','V4-425',
       'V5-575','N1-Exch','N1-175','N2-225','N3-325','N4-425','F1-275','F2-575',
        'F3-475']
    }
   
    int compareTo(obj){
        expiration.compareTo(obj.expiration)
    }
    
    private Date makeExpiration()
    {
        Calendar c = Calendar.getInstance()
        c.set(c.get(Calendar.YEAR),12,31)
        c.getTime()
    }
}
