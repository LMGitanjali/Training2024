class registerrepo{
    enterurl(url){
        cy.visit(url)
    }

    click(){
        cy.get('#loginPanel > :nth-child(3) > a').click()
    }

    enterfname(firstName){
        cy.get('#customer\\.firstName').click().type(firstName)
    }

    enterlname(lastName){
        cy.get('#customer\\.lastName').click().type(lastName)
    }

    enterstreet(street){
        cy.get('#customer\\.address\\.street').click().type(street)
    }

    entercity(city){
        cy.get('#customer\\.address\\.city').click().type(city)
    }

    enterstate(state){
        cy.get('#customer\\.address\\.state').click().type(state)
    }

    enterzipCode(zipCode){
        cy.get('#customer\\.address\\.zipCode').click().type(zipCode)
    }

    enterpnumber(phoneNumber){
        cy.get('#customer\\.phoneNumber').click().type(phoneNumber)
    }

    enterssn(ssn){
        cy.get('#customer\\.ssn').click().type(ssn)
    }

    enteruname(username){
        cy.get('#customer\\.username').click().type(username)
    }

    enterpwd(password){
        cy.get('#customer\\.password').click().type(password)
    }

    enterrpwd(repeatedPassword){
        cy.get('#repeatedPassword').click().type(repeatedPassword)
    }

    click2(){
        cy.get('[colspan="2"] > .button').click()
    }

    click3(){
        cy.get('#leftPanel > ul > :nth-child(8) > a').click()
    }
}

export{registerrepo}