describe('Spicejet signup', ()=>{

    it("Login with spicejet",()=>{
    //cy.visit("https://www.spicejet.com/")
    //cy.get("div[class='css-76zvg2 r-jwli3a r-ubezar']").click();//login
   //cy.get('.r-eu3ka > .css-76zvg2').click();//signup
  
   cy.visit("https://spiceclub.spicejet.com/signup")
   cy.get('.col-sm-4 > .form-control').select("Miss")
   cy.get('#first_name').type("Neha")
   cy.get('#last_name').type("Dalvi")
   cy.get(':nth-child(3) > :nth-child(1) > .form-control').select("India")
   cy.get('#dobDate').click()
   cy.get('.react-datepicker__month-select').select("May")
   cy.get('.react-datepicker__year-select').select("1996")
   cy.get('.react-datepicker__day--024').click()
   cy.get('.react-tel-input > .form-control').type("8937737737")
   cy.get('#email_id').click().type("gbhanr@gmail.com")
   cy.get('#new-password').click().type("SHUBhams@123")
   cy.get('#c-password').click().type("SHUBham@123")
   cy.get('#defaultCheck1').check()
   cy.get('.px-sm-4 > a > .btn').click();
    })

})