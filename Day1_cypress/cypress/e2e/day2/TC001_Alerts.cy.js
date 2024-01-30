describe("Alerts", ()=>{
    it.skip("Simple Alerts", ()=>{
        cy.visit("https://letcode.in/alert")
        cy.get('#accept').click()
        cy.on('window:alert', (t)=>{
        expect(t).contains('Hey! Welcome to LetCode')
            //expect(t).to.contains('shubham') //error
        })
    })


    it.skip("Confirm Alerts", ()=>{
        cy.visit("https://letcode.in/alert")
        cy.get('#confirm').click()
        cy.on('window:confirm', (t)=>{
            expect(t).contains('Are you happy with LetCode?')
            //expect(t).contains('Hey! Welcome to LetCode')//error
            //expect(t).to.contains('bol')
        })
    })

    it.only("Prompt Alert", ()=>{
        cy.visit("https://letcode.in/alert")
        cy.window().then((a)=>{
        cy.stub(a,'prompt').returns('Gitanjali')
        })
     cy.get('#prompt').click()
    })
  })
