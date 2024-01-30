describe("ParaBank",()=>{
    it("Using Fixture",()=>{

        cy.fixture("emailpara").then((data)=>{
            cy.visit(data.url)
            cy.get('.contact > a').click();
            cy.get('#name').type(data.name)
            cy.get('#email').type(data.email)
            cy.get('#phone').type(data.phone)
            cy.get('#message').type(data.msg)
            cy.get('[colspan="2"] > .button').click()
        })
        
    })
})