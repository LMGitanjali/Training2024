describe("ParaBank",()=>{
    it("Email",()=>{
        cy.visit("https://parabank.parasoft.com/parabank/index.htm")
        cy.get('.contact > a').click()
        cy.get('#name').type("Nihal")
        cy.get('#email').type("nihal2@gmail.com")
        cy.get('#phone').type("739399393")
        cy.get('#message').type("Hello Nihal, How are you?")
        cy.get('[colspan="2"] > .button').click()
    })
})