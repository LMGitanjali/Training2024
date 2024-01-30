class spicerepo{
    enterurl(url){
        cy.visit(url)
    }
    entertitle(title){
        cy.get('.col-sm-4 > .form-control').select(title)
    }
    enterfname(firstname){
        cy.get('#first_name').type(firstname)
    }
    enterlname(lastname){
        cy.get('#last_name').type(lastname)
    }
    entercountry(country){
        cy.get(':nth-child(3) > :nth-child(1) > .form-control').select(country)
    }
    enterdate(date){
        cy.get('#dobDate').type(date)
    }
    enternumber(mobile_number){
        cy.get('.react-tel-input > .form-control').type(mobile_number)
    }
    enteremail(email){
        cy.get('#email_id').click().type(email)
    }
    enterdate(date){
        cy.get('#dobDate').type(date)
    }
    enterpwd1(pwd1){
        cy.get('#new-password').click().type(pwd1)
    }
    enterpwd2(pwd2){
        cy.get('#c-password').click().type(pwd2)
    }
    clicksubmit(){
        cy.get('#defaultCheck1').click();
        cy.get('.px-sm-4 > a > .btn').click();
    }
}
export{spicerepo}