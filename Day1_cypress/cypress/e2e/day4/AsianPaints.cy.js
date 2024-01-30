

describe('AsianPaints',()=>{
    it('add to cart',()=>{
        cy.visit('https://www.asianpaints.com/')
        cy.url().should("eq","https://www.asianpaints.com/")
        .and("contain","asian")
        cy.get(':nth-child(6) > .track_section > .iconTextLinks__text').click();
        cy.get(':nth-child(1) > .anchor-explore-stores > .imageWrapper > .image-explore-stores > img').click()
        cy.wait(2000)
        cy.get('[data-attr-prodsku="W107WH05L45"] > :nth-child(5) > .global-button-white').click()
        cy.get('#cartPinCode').type('400604')
        cy.get('.pin-code-form > .ctaComp > .ctaText').click()
        cy.get('#onetrust-close-btn-container > .onetrust-close-btn-handler').click();
        cy.get('.cart-items-dropdowb').click().should("contain","199");
    })

    it.skip("Explicit Assertions",()=>{
        cy.visit('https://www.asianpaints.com/')
     
        let exprice="199"
        cy.get('.cart-items-dropdowb').then((x)=>{
            let price=x.text()

            //assert.Equal(price,exprice)--Error
        })
        })


        it.skip("href attribute", ()=>{

            cy.visit("https://www.asianpaints.com/online-shop/colour-selection-tools.html")
            cy.wait(3000)
            cy.get('[href="https://www.asianpaints.com/online-shop/colour-selection-tools/woodtech-spectra-1600.html"] > p').then(newtab=>{

                const hreftab=newtab.prop('href')
            cy.visit(hreftab)
            cy.url().should("eq","https://www.asianpaints.com/online-shop/colour-selection-tools/woodtech-spectra-1600.html")
            })

})
})
