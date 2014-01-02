package org.ohiocdc

class ProgramInvolvement 
{
    boolean CDC = false
    boolean CHDO = false
    boolean financialLitTraining = false
    boolean micro = false
    boolean CED = false
    boolean homeownershipHousing = false
    boolean rentalHousing = false
    boolean homebuyerCounseling = false
    String IDA
    boolean JOLI = false
    boolean state_PJ = false
    boolean HUD_Approved_Counseling = false
    boolean moneyStyleUsed = false
    boolean NSP = false
    
    
    static belongsTo = Person, Organization

    static constraints = {
        IDA (inList: ["No","OCDCA Organization", "Non-OCDCA Organization", "Both"])
    }
}
