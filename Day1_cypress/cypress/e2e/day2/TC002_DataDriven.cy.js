describe('Spicejet signup', ()=>{

    it("Login with spicejet",()=>{
      
      cy.fixture('data_spicejet').then((spice)=>{ 
      cy.visit(spice.url)

      cy.get('.col-sm-4 > .form-control').select(spice.title)
      cy.get('.col-sm-4 > .form-control').should("be.visible") 

      cy.get('#first_name').type(spice.firstname)
      cy.get('#last_name').type(spice.lastname)

      cy.get(':nth-child(3) > :nth-child(1) > .form-control').should("be.visible").select(spice.country)
  // cy.get('#dobDate').should("be.visible").click()
 /*   cy.get('.react-datepicker__month-select').should("be.visible").select("May")
      cy.get('.react-datepicker__year-select').should("be.visible").select("1996")
      cy.get('.react-datepicker__day--024').should("be.visible").click() */

      cy.get('#dobDate').should("be.visible").click().type(spice.date)
      cy.get('.react-tel-input > .form-control').should("be.visible").type(spice.mobile_number)

      cy.get('#email_id').click().should("be.visible").type(spice.email)
      cy.get('#new-password').click().should("be.visible").type(spice.pwd1)
     //cy.get('#c-password').click().should("be.visible").type(spice.pwd2)
      cy.get('#c-password').click().should("be.visible").type()
      cy.get('#defaultCheck1').should("be.visible").check()
      cy.get('.px-sm-4 > a > .btn').should("be.visible").click(); 
    })
})
})