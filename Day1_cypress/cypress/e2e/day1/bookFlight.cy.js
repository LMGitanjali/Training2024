describe("Book flight",()=>{
    it("Book",()=>{
        cy.visit("https://www.spicejet.com/")
        cy.get('[data-testid="travel-type-1"] > .css-76zvg2').click()
        cy.get('[data-testid="search-source-code"]').click()
        cy.get('[data-testid="auto-cmp-txt"]').type("AGR")
        cy.get('[data-testid="auto-cmp-row-title-0"]').click();

        cy.get('[data-testid="search-destination-code"]').click()
        cy.get('[data-testid="auto-cmp-txt"]').type("BOM")
        cy.get('[data-testid="auto-cmp-row-title-0"]').click()
        //cy.get(':nth-child(1) > .r-1loqt21 > .r-1awozwy > .css-1dbjc4n > [data-testid="search-renderDatesText"]').click()
        cy.get('.r-1awozwy > :nth-child(1) > [data-testid="search-renderPax"]').click()
        cy.get('[data-testid="home-travellers-adult-3"]').click()
        cy.get('[data-testid="home-travellers-action-btn"]').click()

        cy.get('[style="flex-wrap: nowrap;"] > :nth-child(1) > .css-1dbjc4n > .css-76zvg2').click()

        cy.get('[data-testid="search-submit-btn"]').click()

        
    })
})