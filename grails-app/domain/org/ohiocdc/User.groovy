package org.ohiocdc

class User {
    
    String firstName
    String lastName
    String email
    String userName
    String password
    String accessLevel

    static constraints = {
        userName blank: false
        password password: true, blank: false
        email Email: true, blank: false
        firstName blank: false
        lastName blank: false
        accessLevel inList: ["Read-Only", "Modify", "Add", "Delete", "Admin"], blank: false
    }
}
