describe('Spicejet signup', ()=>{

    it("Login with spicejet",()=>{

   cy.visit("https://spiceclub.spicejet.com/signup")
   cy.url().should("eq","https://spiceclub.spicejet.com/signup")
   cy.get('.title-black').should("contain","Enrollment")

   /* cy.get('.col-sm-4 > .form-control').select("Miss")
   cy.get('.col-sm-4 > .form-control').should("be.visible") */

   cy.get('.col-sm-4 > .form-control').select("Miss")
   cy.get('.col-sm-4 > .form-control').should("be.visible")
   cy.get('.col-sm-4 > .form-control').then((t)=>{
    let val = t.prop('value')
    assert.equal(val,"MISS")
   })

   cy.get('#first_name').type("Neha")
   cy.get('#last_name').type("Dalvi")
   cy.get(':nth-child(3) > :nth-child(1) > .form-control').should("be.visible").select("Germany")
   cy.get('#dobDate').should("be.visible").click()
   cy.get('.react-datepicker__month-select').should("be.visible").select("May")
   cy.get('.react-datepicker__year-select').should("be.visible").select("1996")
   cy.get('.react-datepicker__day--024').should("be.visible").click()
   cy.get('.react-tel-input > .form-control').should("be.visible").type("9819293579")
   cy.get('#email_id').click().should("be.visible").type("shubhdalvi@gmail.com")
   cy.get('#new-password').click().should("be.visible").type("SHUBham@123")
   cy.get('#c-password').click().should("be.visible").type("SHUBham@123")
   cy.get('#defaultCheck1').should("be.visible").check()
   cy.get('.px-sm-4 > a > .btn').should("be.visible").click();
    })

})